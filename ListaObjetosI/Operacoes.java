package ListaObjetosI;

public class Operacoes {
	private int num1 = 0, num2 = 0;
	
	public Operacoes() {
		
	}
	
	public void operacoesNumeros() {
		System.out.println("Adi��o de "+num1+" com "+num2+" � :"+(num1+num2));
		System.out.println("A subtra��o de "+num1+" e "+num2+" � :"+(num1-num2));
		System.out.println("A multiplica��o de "+num1+" por "+num2+" � :"+(num1*num2));
		System.out.println("A divis�o de "+num1+" por "+num2+" � :"+(num1/num2));
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	

}
