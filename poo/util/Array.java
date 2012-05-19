package poo.util;

import java.util.*;

public final class Array {
	private Array() {} // Non istanziabile
	public static int ricercaLineare(int[] v, int x) {
		for (int i = 0; i < v.length; i++)
			if (v[i] == x) return i;
		return -1;
	} // ricercaLineare
	public static int ricercaLineareOttimizzata(int[] v, int x) {
		// v è supposto ordinato per valori crescenti
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x) return i;
			if (v[i] > x) return -1;
		}
		return -1;
	} // ricercaLineareOttimizzata
	public static int ricercaLineare(double[] v, double x) {
		for (int i = 0; i < v.length; i++)
			if (v[i] == x) return i;
		return -1;
	} // ricercaLineare
	public static int ricercaLineareOttimizzata(double[] v, double x) {
		// v è supposto ordinato per valori crescenti
		for (int i = 0; i < v.length; i++) {
			if (v[i] == x) return i;
			if (v[i] > x) return -1;
		}
		return -1;
	} // ricercaLineareOttimizzata
	public static <T> int ricercaLineare(T[] v, T x) {
		for (int i = 0; i < v.length; i++)
			if (v[i].equals(x)) return i;
		return -1;
	} // ricercaLineare
	public static <T extends Comparable<? super T>> int ricercaLineareOttimizzata(T[] v, T x) {
		// v è supposto ordinato per valori crescenti
		for (int i = 0; i < v.length; i++) {
			if (v[i].compareTo(x) == 0) return i;
			if (v[i].compareTo(x) > 0) return -1;
		}
		return -1;
	} // ricercaLineareOttimizzata
	public static void bubbleSort(int[] v) {
		int limite = 0; // Assegnazione fittizia
		for (int j = v.length - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (v[i] > v[i + 1]) { // scambia
					int tmp = v[i]; v[i] = v[i + 1];
					v[i + 1] = tmp; scambi++; limite = i;
				}
			if (scambi == 0) break;
		}
	} // bubbleSort
	public static void bubbleSort(double[] v) {
		int limite = 0; // Assegnazione fittizia
		for (int j = v.length - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (v[i] > v[i + 1]) { // scambia
					double tmp = v[i]; v[i] = v[i + 1];
					v[i + 1] = tmp; scambi++; limite = i;
				}
			if (scambi == 0) break;
		}
	} // bubbleSort
	public static <T extends Comparable<? super T>> void bubbleSort(T[] v) {
		int limite = 0; // Assegnazione fittizia
		for (int j = v.length - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (v[i].compareTo(v[i + 1]) > 0) { // scambia
					T tmp = v[i]; v[i] = v[i + 1];
					v[i + 1] = tmp; scambi++; limite = i;
				}
			if (scambi == 0) break;
		}
	}//bubbleSort
	public static void selectionSort(int[] v) {
		for (int j = v.length - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i <= j; i++)
				if (v[i] > v[indMax]) indMax = i;
			int tmp = v[j]; v[j] = v[indMax];
			v[indMax] = tmp;
		}
	} // selectionSort
	public static void selectionSort(double[] v) {
		for (int j = v.length - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i <= j; i++)
				if (v[i] > v[indMax]) indMax=i;
			double tmp = v[j]; v[j] = v[indMax];
			v[indMax] = tmp;
		}
	} // selectionSort
	public static <T extends Comparable<? super T>> void selectionSort(T[] v) {
		for (int j = v.length - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i<=j; i++)
				if (v[i].compareTo(v[indMax]) > 0) indMax=i;
			T tmp = v[j]; v[j] = v[indMax];
			v[indMax] = tmp;
		}
	} // selectionSort
	public static void insertionSort(int[] v) {
		for (int i = 1; i < v.length; i++) {
			int x = v[i]; int j = i;
			while (j > 0 && v[j - 1] > x) {
				v[j] = v[j - 1]; j--;
			}
			v[j] = x;
		}
	} // insertionSort
	public static void insertionSort(double[] v) {
		for (int i = 1; i < v.length; i++) {
			double x = v[i]; int j = i;
			while (j > 0 && v[j - 1] > x) {
				v[j] = v[j - 1]; j--;
			}
			v[j] = x;
		}
	} // insertionSort
	public static <T extends Comparable<? super T>> void insertionSort(T[] v) {
		for (int i = 1; i < v.length; i++) {
			T x = v[i]; int j = i;
			while (j > 0 && v[j - 1].compareTo(x) > 0) {
				v[j] = v[j - 1]; j--;
			}
			v[j] = x;
		}
	} // insertionSort
	public static void bucketSort(int[] v) {
		int MAX = 200;
		int[] a = new int[MAX];
		for (int i = 0; i < v.length; i++) {
			if (v[i] < 0 || v[i] >= MAX) return;
			a[v[i]]++;
		}
		int pos = 0;
		for (int i = 0; i < MAX; i++)
			for (int j = 1; j <= a[i]; j++)
				v[pos++] = i;
	} // bucketSort
	public static int ricercaBinaria(int[] v, int x) {
		// v è supposto ordinato per valori crescenti
		int inf = 0, sup = v.length - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			if (v[med] == x) return med;
			if (v[med] > x) sup = med - 1;
			else inf = med + 1;
		}
		return -1;
	} // ricercaBinaria
	public static int ricercaBinaria(double[] v, double x) {
		// v è supposto ordinato per valori crescenti
		int inf = 0, sup = v.length - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			if (v[med] == x) return med;
			if (v[med] > x) sup = med - 1;
			else inf = med + 1;
		}
		return -1;
	} // ricercaBinaria
	public static <T extends Comparable<? super T>> int ricercaBinaria(T[] v, T x) {
		// v è supposto ordinato per valori crescenti
		int inf = 0, sup = v.length - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			int esito = v[med].compareTo(x);
			if (esito == 0) return med;
			if (esito > 0) sup = med - 1;
			else inf = med + 1;
		}
		return -1;
	} // ricercaBinaria
	public static <T> int ricercaLineare(T[] v, T x, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		for (int i = 0; i < size; i++)
			if (v[i].equals(x)) return i;
		return -1;
	} // ricercaLineare
	public static <T extends Comparable<? super T>> int ricercaLineareOttimizzata(T[] v, T x, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		// v è supposto ordinato per valori crescenti
		for (int i = 0; i < size; i++) {
			if (v[i].equals(x)) return i;
			if (v[i].compareTo(x) > 0) return -1;
		}
		return -1;
	} // ricercaLineareOttimizzata
	public static void bubbleSort(int[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		int limite = 0; // Assegnazione fittizia
		for (int j = size - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (v[i] > v[i + 1]) { // scambia
					int tmp = v[i]; v[i] = v[i + 1];
					v[i + 1] = tmp; scambi++; limite = i;
				}
			if (scambi == 0) break;
		}
	} // bubbleSort
	public static void bubbleSort(double[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		int limite = 0; // Assegnazione fittizia
		for (int j = size - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (v[i] > v[i + 1]) { // scambia
					double tmp = v[i]; v[i] = v[i + 1];
					v[i + 1] = tmp; scambi++; limite = i;
				}
			if (scambi == 0) break;
		}
	} // bubbleSort
	public static <T extends Comparable<? super T>> void bubbleSort(T[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		int limite = 0; // Assegnazione fittizia
		for (int j = size - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (v[i].compareTo(v[i + 1]) > 0) { // scambia
					T tmp = v[i]; v[i] = v[i + 1];
					v[i + 1] = tmp; scambi++; limite = i;
				}
			if (scambi == 0) break;
		}
	} // bubbleSort
	public static void selectionSort(int[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		for (int j = size - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i <= j; i++)
				if (v[i] > v[indMax]) indMax = i;
			int tmp = v[j]; v[j] = v[indMax];
			v[indMax] = tmp;
		}
	} // selectionSort
	public static void selectionSort(double[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		for (int j = size - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i <= j; i++)
				if (v[i] > v[indMax]) indMax = i;
			double tmp = v[j]; v[j] = v[indMax];
			v[indMax] = tmp;
		}
	} // selectionSort
	public static <T extends Comparable<? super T>> void selectionSort(T[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		for (int j = size - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i <= j; i++)
				if (v[i].compareTo(v[indMax]) > 0) indMax = i;
			T tmp = v[j]; v[j] = v[indMax];
			v[indMax] = tmp;
		}
	} // selectionSort
	public static void insertionSort(int[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		for (int i = 1; i < size; i++) {
			int x = v[i]; int j = i;
			while (j > 0 && v[j - 1] > x) {
				v[j] = v[j - 1]; j--;
			}
			v[j] = x;
		}
	} // insertionSort
	public static void insertionSort(double[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		for (int i = 1; i < size; i++) {
			double x = v[i]; int j = i;
			while (j > 0 && v[j - 1] > x) {
				v[j] = v[j - 1]; j--;
			}
			v[j] = x;
		}
	} // insertionSort
	public static <T extends Comparable<? super T>> void insertionSort(T[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		for (int i = 1; i < v.length; i++) {
			T x = v[i]; int j = i;
			while (j > 0 && v[j - 1].compareTo(x) > 0) {
				v[j] = v[j - 1]; j--;
			}
			v[j] = x;
		}
	} // insertionSort
	public static void bucketSort(int[] v, int size) {
		int MAX = 200;
		int[] a = new int[MAX];
		for (int i = 0; i < size; i++) {
			if (v[i] < 0 || v[i] >= MAX) return;
			a[v[i]]++;
		}
		int pos = 0;
		for (int i = 0; i < MAX; i++)
			for (int j = 1; j <= a[i]; j++)
				v[pos++] = i;
	} // bucketSort
	public static int ricercaBinaria(int[] v, int x, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		// v è supposto ordinato per valori crescenti
		int inf = 0, sup = size - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			if (v[med] == x) return med;
			if (v[med] > x) sup = med - 1;
			else inf = med + 1;
		}
		return -1;
	} // ricercaBinaria
	public static int ricercaBinaria(double[] v, double x, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		// v è supposto ordinato per valori crescenti
		int inf = 0, sup = size - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			if (v[med] == x) return med;
			if (v[med] > x) sup = med - 1;
			else inf = med + 1;
		}
		return -1;
	} // ricercaBinaria
	public static <T extends Comparable<? super T>> int ricercaBinaria(T[] v, T x, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		// v è supposto ordinato per valori crescenti
		int inf=0, sup=size - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			int esito = v[med].compareTo(x);
			if (esito == 0) return med;
			if (esito > 0) sup = med - 1;
			else inf = med + 1;
		}
		return -1;
	} // ricercaBinaria
	public static <T extends Comparable<? super T>> T max(T[] v) {
		return max(v, 0, v.length - 1);
	} // max
	private static <T extends Comparable<? super T>> T max(T[] v, int inf, int sup) {
		if (inf == sup) return v[inf];
		int med = (inf + sup) / 2;
		T m1 = max(v, inf, med);
		T m2 = max(v, med + 1, sup);
		return (m1.compareTo(m2) > 0 ? m1 : m2);
	} // max
	public static void permuta(int[] v) {
		permuta(v, 0);
	} // permuta
	private static void permuta(int[] v, int i) {
		if (i == v.length) System.out.println(Arrays.toString(v));
		else
			for (int j = i; j < v.length; j++) {
				int tmp = v[i]; v[i] = v[j]; v[j] = tmp;
				permuta(v, i + 1);
				tmp = v[i]; v[i] = v[j]; v[j] = tmp;
			}
	}
	// Metodi su Vector
	public static int ricercaLineare(Vector<?> v, Object x) {
		for (int i = 0; i < v.size(); i++)
			if (v.get(i).equals(x)) return i;
		return -1;
	} // ricercaLineare
	public static <T extends Comparable<? super T>> int ricercaLineareOttimizzata(Vector<T> v, T x) {
		// v è supposto ordinato per valori crescenti
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).equals(x)) return i;
			if (v.get(i).compareTo(x) > 0) return -1;
		}
		return -1;
	} // ricercaLineareOttimizzata
	public static <T extends Comparable<? super T>> int ricercaBinaria(Vector<T> v, T x) {
		// v è supposto ordinato per valori crescenti
		int inf = 0, sup = v.size() - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			if (v.get(med).equals(x)) return med;
			if (v.get(med).compareTo(x) > 0) sup = med - 1;
			else inf = med + 1;
		}
		return -1;
	} // ricercaBinaria
	public static <T extends Comparable<? super T>> void selectionSort(Vector<T> v) {
		for (int j = v.size() - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i <= j; i++)
				if (v.get(i).compareTo(v.get(indMax)) > 0) indMax = i;
			T tmp = v.get(j); v.set(j, v.get(indMax));
			v.set(indMax, tmp);
		}
	} // selectionSort
	public static <T extends Comparable<? super T>> void bubbleSort(Vector<T> v) {
		int limite = 0; // Assegnazione fittizia
		for (int j = v.size() - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (v.get(i).compareTo(v.get(i + 1)) > 0) { // scambia
					T tmp = v.get(i); v.set(i, v.get(i + 1));
					v.set(i + 1, tmp); scambi++; limite = i;
				}
				if (scambi == 0) break;
			}
	} // bubbleSort
	public static <T extends Comparable<? super T>> void insertionSort(Vector<T> v) {
		for (int i = 1; i < v.size(); i++) {
			T x = v.get(i); int j = i;
			while (j > 0 && v.get(j - 1).compareTo(x) > 0) {
				v.set(j, v.get(j - 1)); j--;
			}
			v.set(j, x);
		}
	} // insertionSort
	public static double prodottoScalare(Vector<Double> v1, Vector<Double> v2) {
		if (v1.size() != v2.size()) throw new IllegalArgumentException();
		double p = 0;
		for (int i = 0; i < v1.size(); i++)
			p += v1.get(i) * v2.get(i); // Unboxing automatico
		return p;
	} // prodottoScalare
	public static <T> void compatta(Vector<T> v) {
		for (int i = 0; i < v.size() - 1; i++)
			for (int j = i + 1; j < v.size(); j++)
				if (v.get(i).equals(v.get(j)))
					v.remove(j--);
	} // compatta
	public static double modulo(Vector<Double> v) {
		double m = 0;
		for (int i = 0; i < v.size(); i++)
			m += v.get(i) * v.get(i);
		return Math.sqrt(m);
	} // modulo
	@SuppressWarnings("unchecked")
	public static boolean base(Vector<Double> ... v) {
		int n = v.length;
		for (int i = 0; i < n; i++)
			if (v[i].size() != n) return false;
		double[][] m = new double[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				m[i][j] = v[i].get(j);
		return Matrix.determinante(m) != 0;
	} // base
	// Metodi su ArrayList
	public static int ricercaLineare(ArrayList<?> l, Object x) {
		for (int i = 0; i < l.size(); i++)
			if (l.get(i).equals(x)) return i;
		return -1;
	} // ricercaLineare
	public static <T extends Comparable<? super T>> int ricercaLineareOttimizzata(ArrayList<T> l, T x) {
		// l è supposto ordinato per valori crescenti
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).equals(x)) return i;
			if (l.get(i).compareTo(x) > 0) return -1;
		}
		return -1;
	} // ricercaLineareOttimizzata
	public static <T extends Comparable<? super T>> int ricercaBinaria(ArrayList<T> l, T x) {
		// l è supposto ordinato per valori crescenti
		int inf = 0, sup = l.size() - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			if (l.get(med).equals(x)) return med;
			if (l.get(med).compareTo(x) > 0) sup = med - 1;
			else inf = med + 1;
		}
		return -1;
	} // ricercaBinaria
	public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> l) {
		for (int j = l.size() - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i <= j; i++)
				if (l.get(i).compareTo(l.get(indMax)) > 0) indMax = i;
			T tmp = l.get(j); l.set(j, l.get(indMax));
			l.set(indMax, tmp);
		}
	} // selectionSort
	public static <T extends Comparable<? super T>> void bubbleSort(ArrayList<T> l) {
		int limite = 0; // Assegnazione fittizia
		for (int j = l.size() - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (l.get(i).compareTo(l.get(i + 1)) > 0) { // scambia
					T tmp = l.get(i); l.set(i, l.get(i + 1));
					l.set(i + 1, tmp); scambi++; limite = i;
				}
				if (scambi == 0) break;
			}
	} // bubbleSort
	public static <T extends Comparable<? super T>> void insertionSort(ArrayList<T> l) {
		for (int i = 1; i < l.size(); i++) {
			T x = l.get(i); int j = i;
			while (j > 0 && l.get(j - 1).compareTo(x) > 0) {
				l.set(j, l.get(j - 1)); j--;
			}
			l.set(j, x);
		}
	} // insertionSort
	public static double prodottoScalare(ArrayList<Double> l1, ArrayList<Double> l2) {
		if (l1.size() != l2.size()) throw new IllegalArgumentException();
		double p = 0;
		for (int i = 0; i < l1.size(); i++)
			p += l1.get(i) * l2.get(i); // Unboxing automatico
		return p;
	} // prodottoScalare
	public static <T> void compatta(ArrayList<T> l) {
		ListIterator<T> li = l.listIterator(); T curr; int index = 0;
		while (li.hasNext()) {
			curr = li.next();
			while (li.hasNext()) {
				if (curr.equals(li.next()))
					li.remove();
			}
			li = l.listIterator(index < l.size() ? index++ : index);
		}
	} // compatta
	public static double modulo(ArrayList<Double> l) {
		return Math.sqrt(prodottoScalare(l, l));
	} // modulo
	@SuppressWarnings("unchecked")
	public static boolean base(ArrayList<Double> ... l) {
		int n = l.length;
		for (int i = 0; i < n; i++)
			if (l[i].size() != n) return false;
		double[][] m = new double[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				m[i][j] = l[i].get(j);
		return Matrix.determinante(m) != 0;
	} // base
	@SuppressWarnings("unchecked")
	public static void main(String[]args) {
		int[] a = {13, 10, 2, 4, 9, 5};
		System.out.println("Vettore di interi prima dell'ordinamento:\n" + Arrays.toString(a));
		bucketSort(a);
		System.out.println("Vettore di interi dopo l'ordinamento:\n" + Arrays.toString(a));
		System.out.println("Permutazioni:");
		permuta(a);
		Vector<Integer> v = new ArrayVector<Integer>();
		v.add(13); v.add(2); v.add(10); v.add(4); v.add(9); v.add(5);
		System.out.println("Vector prima dell'ordinamento:\n" + v);
		insertionSort(v);
		System.out.println("Vector dopo l'ordinamento:\n" + v);
		int x = 5; int i = ricercaBinaria(v, x);
		System.out.println(x + " si trova nel vettore in posizione " + i);
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("casa"); ls.add("dado"); ls.add("lupo"); ls.add("dado"); ls.add("abaco"); ls.add("lupo");
		System.out.println("Lista di stringhe con duplicati: " + ls);
		compatta(ls);
		System.out.println("Lista senza duplicati: " + ls);
		ArrayList<Double> e1 = new ArrayList<Double>(); e1.add(1D); e1.add(0D); e1.add(0D); // (1, 0, 0)
		ArrayList<Double> e2 = new ArrayList<Double>(); e2.add(0D); e2.add(1D); e2.add(0D); // (0, 1, 0)
		ArrayList<Double> e3 = new ArrayList<Double>(); e3.add(0D); e3.add(0D); e3.add(1D); // (0, 0, 1)
		System.out.println("L'insieme [" + e1 + ", " + e2 + ", " + e3 + "]\ncostituisce una base di R3: " + base(e1, e2, e3));
	} // main
} // Util
