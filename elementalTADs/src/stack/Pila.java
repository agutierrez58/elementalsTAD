package stack;

import java.util.Vector;

public class Pila {

	private int mida;

	private Vector<Integer> pila;

	public Pila() {
		super();
		pila = new Vector<Integer>();
		mida = 0;
	}

	public boolean pilaBuida() {

		if (mida == 0) {
			return true;
		}
		return false;
	}

	public void apilar(Integer o) {
		pila.add(mida, o);
		mida++;
	}

	public Integer desapilar() {

		try {
			if (pilaBuida())
				throw new ErrorPilaVacia();
			else {
				return pila.get(--mida);
			}

		} catch (ErrorPilaVacia error) {
			System.out.println("ERROR: la pila est� buida");
			return null;

		}
	}

	public int getNumElements() {
		return mida;
	}

	@SuppressWarnings("serial")
	class ErrorPilaVacia extends Exception {
		public ErrorPilaVacia() {
			super();
		}
	}
	
	public static void main(String[] args) {
		// Classe Pila
		// Nota: Comprovar el joc de proves PilaTest
		//       Comprovar el coverage (Eclemma)
	}

}