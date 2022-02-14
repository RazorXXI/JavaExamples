package variables;

import java.util.*;

public class Variables {

	//Variables de clase. No se necesita instanciar a la clase para acceder a ellas.
	public static String varClaseString = "ESTA ES UNA VARIABLE DE CLASE";
	
	public void ejemploVariablesPrimitivas() {
		//NUMERICAS
		
		//1 - ENTEROS
		byte 	varByte 	= 100; 			//1 Byte (8 bits)   - Desde -2^7 a (+2^7)-1 => -128 a 127
		short 	varShort 	= -300; 		//2 Bytes (16 bits) - Desde -2^15 a (+2^15)-1 => -32.768 a 32.767
		int		varInt 		= 2147483647;	//4 Bytes (32 bits) - Desde -2^31 a (+2^31)-1 => -2.147.483.648 a 2.147.483.647
		long	varLong 	= 21474883647L;	//8 Bytes (64 bits) - Desde -2^63 a (+2^63)-1 => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
		
		//2 - REALES
		float 	varFloat 	= 37.58F;		//4 Bytes. Precision Simple
		double 	varDouble 	= 56.1238792;	//8 Bytes. Precision Doble
		
		//3 - BOOLEANOS
		boolean varBoolean = true;			//Solo pueden tomar como valores true o false
		
		//4 - CARACTER
		char varChar = 'c'; 				//Representa cualquier caracter del lenguaje humano.
		
		System.out.println("varByte: " + varByte);
		System.out.println("varShort: " + varShort);
		System.out.println("varInt: " + varInt);
		System.out.println("varLong: " + varLong);
		System.out.println("varFloat: " + varFloat);
		System.out.println("varDouble: " +varDouble);
		System.out.println("varBoolean: " + varBoolean);
		System.out.println("varChar: " + varChar);
	}
	
	public void ejemploVariablesObjeto() {

		//CADENA DE TEXTO
		String varString = "CADENA DE TEXTO";

		//ARRAY
		String[] varArray = {"Cadena_1","Cadena_2","Cadena_3","Cadena_4"};

		//LISTAS
		List<String> varList = new ArrayList<>();
		varList.add("CADENA DE LISTA1");
		varList.add("CADENA DE LISTA2");
		varList.add("CADENA DE LISTA3");
		varList.add("CADENA DE LISTA4");
		
		//DE OBJETO GARAGE
		//Garage garage = new Garage();
		
		System.out.println("varString: " + varString);
		System.out.println("varArray: " + Arrays.toString(varArray));
		System.out.println("varList: " + Arrays.toString(varList.toArray()));
	}
}
