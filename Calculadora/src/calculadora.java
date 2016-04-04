public class calculadora {
	//atributos
	float numero1;
	float numero2;
	//constructores
	public calculadora(){
		numero1=0;
		numero2=0;
	}
	public calculadora(float numero1,float numero2){
		this.numero1=numero1;
		this.numero2=numero2;
	}
	//metodos
	public float suma(){
		return numero1+numero2;
	}
	public float resta(){
		return numero1-numero2;
	}
	public float division(){
		return numero1/numero2;
	}
	public float multiplicacion(){
		return numero1*numero2;
	}
}
