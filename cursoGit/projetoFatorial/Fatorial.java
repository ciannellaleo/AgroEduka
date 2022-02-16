public class Fatorial {

	// versao interativa do cálculo do fatorial
	public int calcularFatorial(int n) {
	   if (n <= 0)
		throw new IllegalArgumentException("nao existe fatorial para numeros negativos");
	   
	   int resultado = 1;
	   if (n!=0){
	     for (int i = 2; i <=n; i++)
		resultado*=i;
	   }
	   return resultado;
	}
}