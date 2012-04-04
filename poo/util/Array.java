package poo.util;

import java.util.*;

public final class Array{
	private Array() {}
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
	public static int ricercaLineare(Comparable[] v, Comparable x) {
		for (int i = 0; i < v.length; i++)
			if (v[i].compareTo(x) == 0) return i;
		return -1;
	} // ricercaLineare
	public static int ricercaLineareOttimizzata(Comparable[] v, Comparable x) {
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
	public static void bubbleSort(Comparable[] v) {
		int limite = 0; // Assegnazione fittizia
		for (int j = v.length - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (v[i].compareTo(v[i + 1]) > 0) { // scambia
					Comparable tmp = v[i]; v[i] = v[i + 1];
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
	public static void selectionSort (double[] v) {
		for (int j = v.length - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i <= j; i++)
				if (v[i] > v[indMax]) indMax=i;
			double tmp = v[j]; v[j] = v[indMax];
			v[indMax] = tmp;
		}
	} // selectionSort
	public static void selectionSort(Comparable[] v) {
		for (int j = v.length - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i<=j; i++)
				if (v[i].compareTo(v[indMax]) > 0) indMax=i;
			Comparable tmp = v[j]; v[j] = v[indMax];
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
	public static void insertionSort(Comparable[] v) {
		for (int i = 1; i < v.length; i++) {
			Comparable x = v[i]; int j = i;
			while (j > 0 && v[j - 1].compareTo(x) > 0) {
				v[j] = v[j - 1]; j--;
			}
			v[j] = x;
		}
	} // insertionSort
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
	public static int ricercaBinaria(Comparable[] v, Comparable x) {
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
	public static int ricercaLineare(Comparable[] v, Comparable x, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		for (int i = 0; i < size; i++)
			if (v[i].compareTo(x) == 0) return i;
		return -1;
	} // ricercaLineare
	public static int ricercaLineareOttimizzata(Comparable[] v, Comparable x, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		// v è supposto ordinato per valori crescenti
		for (int i = 0; i < size; i++) {
			if (v[i].compareTo(x) == 0) return i;
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
	public static void bubbleSort(Comparable[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		int limite = 0; // Assegnazione fittizia
		for (int j = size - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (v[i].compareTo(v[i + 1]) > 0) { // scambia
					Comparable tmp = v[i]; v[i] = v[i + 1];
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
	public static void selectionSort(Comparable[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		for (int j = size - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i <= j; i++)
				if (v[i].compareTo(v[indMax]) > 0) indMax = i;
			Comparable tmp = v[j]; v[j] = v[indMax];
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
	public static void insertionSort(Comparable[] v, int size) {
		if (size < 0 || size > v.length) throw new IllegalArgumentException();
		for (int i = 1; i < v.length; i++) {
			Comparable x = v[i]; int j = i;
			while (j > 0 && v[j - 1].compareTo(x) > 0) {
				v[j] = v[j - 1]; j--;
			}
			v[j] = x;
		}
	} // insertionSort
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
	public static int ricercaBinaria(Comparable[] v, Comparable x, int size) {
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
	// Metodi su Vector
	public static int ricercaLineare(Vector v, Object x) {
		for (int i = 0; i < v.size(); i++)
			if (v.get(i).equals(x)) return i;
		return -1;
	} // ricercaLineare
	public static int ricercaLineareOttimizzata(Vector v, Object x) {
		// v è supposto ordinato per valori crescenti
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).equals(x)) return i;
			if (((Comparable)v.get(i)).compareTo(x) > 0) return -1;
		}
		return -1;
	} // ricercaLineareOttimizzata
	public static int ricercaBinaria(Vector v, Object x) {
		// v è supposto ordinato per valori crescenti
		int inf = 0, sup = v.size() - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			if (v.get(med).equals(x)) return med;
			if (((Comparable)v.get(med)).compareTo(x) > 0) sup = med - 1;
			else inf = med + 1;
		}
		return -1;
	} // ricercaBinaria
	public static void selectionSort(Vector v) {
		for (int j = v.size() - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i <= j; i++)
				if (((Comparable)v.get(i)).compareTo(v.get(indMax)) > 0) indMax = i;
			Object tmp = v.get(j); v.set(j, v.get(indMax));
			v.set(indMax, tmp);
		}
	} // selectionSort
	public static void bubbleSort(Vector v) {
		int limite = 0; // Assegnazione fittizia
		for (int j = v.size() - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (((Comparable)v.get(i)).compareTo(v.get(i + 1)) > 0) { // scambia
					Object tmp = v.get(i); v.set(i, v.get(i + 1));
					v.set(i + 1, tmp); scambi++; limite = i;
				}
				if (scambi == 0) break;
			}
	} // bubbleSort
	public static void insertionSort(Vector v) {
		for (int i = 1; i < v.size(); i++) {
			Object x = v.get(i); int j = i;
			while (j > 0 && ((Comparable)v.get(j - 1)).compareTo(x) > 0) {
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
	public static void compatta(Vector v) {
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
	public static int ricercaLineare(ArrayList l, Object x) {
		for (int i = 0; i < l.size(); i++)
			if (l.get(i).equals(x)) return i;
		return -1;
	} // ricercaLineare
	public static int ricercaLineareOttimizzata(ArrayList l, Object x) {
		// l è supposto ordinato per valori crescenti
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).equals(x)) return i;
			if (((Comparable)l.get(i)).compareTo(x) > 0) return -1;
		}
		return -1;
	} // ricercaLineareOttimizzata
	public static int ricercaBinaria(ArrayList l, Object x) {
		// l è supposto ordinato per valori crescenti
		int inf = 0, sup = l.size() - 1;
		while (inf <= sup) {
			int med = (inf + sup) / 2;
			if (l.get(med).equals(x)) return med;
			if (((Comparable)l.get(med)).compareTo(x) > 0) sup = med - 1;
			else inf = med + 1;
		}
		return -1;
	} // ricercaBinaria
	public static void selectionSort(ArrayList l) {
		for (int j = l.size() - 1; j > 0; j--) {
			int indMax = 0;
			for (int i = 1; i <= j; i++)
				if (((Comparable)l.get(i)).compareTo(l.get(indMax)) > 0) indMax = i;
			Object tmp = l.get(j); l.set(j, l.get(indMax));
			l.set(indMax, tmp);
		}
	} // selectionSort
	public static void bubbleSort(ArrayList l) {
		int limite = 0; // Assegnazione fittizia
		for (int j = l.size() - 1; j > 0; j = limite) {
			int scambi = 0;
			for (int i = 0; i < j; i++)
				if (((Comparable)l.get(i)).compareTo(l.get(i + 1)) > 0) { // scambia
					Object tmp = l.get(i); l.set(i, l.get(i + 1));
					l.set(i + 1, tmp); scambi++; limite = i;
				}
				if (scambi == 0) break;
			}
	} // bubbleSort
	public static void insertionSort(ArrayList l) {
		for (int i = 1; i < l.size(); i++) {
			Object x = l.get(i); int j = i;
			while (j > 0 && ((Comparable)l.get(j - 1)).compareTo(x) > 0) {
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
	public static void compatta(ArrayList l) {
		ListIterator l1 = l.listIterator(); Object curr; int index = 0;
		while (l1.hasNext()) {
			curr = l1.next();
			while (l1.hasNext()) {
				if (curr.equals(l1.next()))
					l1.remove();
			}
			l1 = l.listIterator(index < l.size() ? index++ : index); // 
		}
	} // compatta
	public static double modulo(ArrayList<Double> l) {
		return Math.sqrt(prodottoScalare(l, l));
	} // modulo
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
	public static void main(String[]args) {
		int[] a = {13, 2, 10, 4, 9, 5};
		System.out.println("Vettore di interi prima dell'ordinamento:\n" + Arrays.toString(a));
		insertionSort(a);
		System.out.println("Vettore di interi dopo l'ordinamento:\n" + Arrays.toString(a));
		Vector v = new ArrayVector();
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
