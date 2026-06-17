package ornek2;

public class Liste<T> {
	private static class Node<T> {
		private Node<T> prev;
		private Node<T> next;
		private T value;

		@Override
		public String toString() {
			return "Node val:" + value + ", prev val:" + prev.value + ", next val:" + next.value;
		}
	}

	private Node<T> first;
	private Node<T> last;
	private int count;

	public void add(T val) {
		addLast(val);
	}

	public void add(T val, int order) {
		Node<T> node = getNode(order);
		if (node == null) {
			add(val);
		} else {
			Node<T> newNode = new Node<>();
			newNode.value = val;
			newNode.next = node;
			newNode.prev = node.prev;
			node.prev.next = newNode;
			node.prev = newNode;
		}
		count++;
	}

	public void addFirst(T val) {
		Node<T> newNode = new Node<>();
		newNode.value = val;
		if (first == null) {
			first = newNode;
			last = newNode;
		} else {
			newNode.next = first;
			first.prev = newNode;
			first = newNode;
		}
		count++;
	}

	public int getCount() {
		return count;
	}

	public void addLast(T val) {
		Node<T> newNode = new Node<>();
		newNode.value = val;
		if (last == null) {
			last = newNode;
			first = newNode;
		} else {
			last.next = newNode;
			newNode.prev = last;
			last = newNode;
		}
		count++;
	}

	public T get(int order) {
		Node<T> node = getNode(order);
		if (node == null) {
			return null;
		}
		return node.value;
	}

	private Node<T> getNode(int order) {
		if (count == 0) {
			return null;
		}
		if (order > count) {
			// hata durumu
			return null;
		}

		Node<T> node = null;

		if (order <= (count >> 1)) {
			// >> bit işlem yapar. 1 basamak sayıyı sağa kaydırır.
			// o da sayının yarısını elde etmemizi sağlar.
			// << işlemi de vardır.
			node = first;
			for (int i = 0; i < order; i++) {
				node = node.next;
			}
		} else {
			node = last;
			for (int i = 0; i < count - order - 1; i++) {
				node = node.prev;
			}
		}
		return node;
	}

	public void clear() {
		first = null;
		last = null;
		count = 0;
	}
}
