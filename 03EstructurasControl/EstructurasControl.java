import java.util.Scanner;

class EstructurasControl{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion, numbinario, total, cantidadproducto, num1, edad, cantidad, numerofac, o;
        int positivos = 0, negativos = 0, figurah = 0;
        double precioAbono, fahrenheit, celsius, kelvin, rankine;
        float precio, resultado, compra=0, cant1, cant2, sum;
        String nombreproducto;
        String binario = "";
        char letra;
        double longitud, anchura, areaRectangulo, perimetroRectangulo;
        double base, altura, areaTriangulo, perimetroTriangulo;
        double radioEsfera, volumenEsfera;
        double radioCilindro, alturaCilindro, volumenCilindro;

        do{

            System.out. println("Bienvenido al programa :) ");
            System.out. println("Elige alguna opcion deseada: ");
            System.out. println("1.- Descuento por edad ");
            System.out. println("2.- Convertir numero decimal a binario ");
            System.out. println("3.- Convertir temperaturas ");
            System.out. println("4.- Numeros Positivos y Negativos ");
            System.out. println("5.- Tiendita ");
            System.out. println("6.- Area y Perimetro ");
            System.out. println("7.- Tabla ");
            System.out. println("8.- Factorial ");
            System.out. println("9.- Dibujito ");
            System.out. println("10.- Figura Hueca ");
            System.out. println("11.- Patrones de codigo ");
            System.out. println("12.- Diamante ");
            System.out. println("13.- Calculadora ");
            System.out. println("14.- Salir ");

            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("Ingrese su edad: ");
                    edad = entrada.nextInt();
                    precioAbono = 100.0; // Precio base del abono

                    if (edad > 65) {
                        precioAbono *= 0.6; // Descuento del 40% para mayores de 65 años
                    } else if (edad < 21) {
                        System.out.print("¿Sus padres son socios? (Sí/No): ");
                        String respuesta = entrada.next();

                        if (respuesta.equalsIgnoreCase("Sí")) {
                            precioAbono *= 0.55; // Descuento del 45% si los padres son socios
                        } else {
                            precioAbono *= 0.75; // Descuento del 25% si los padres no son socios
                        }
                    }

                    System.out.println("El precio del abono es: $" + precioAbono);
                    break;
                case 2:
                    System.out.println("Ingresa un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    if(numbinario > 0){
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario = "0" + binario;
                            }else{
                                binario = "1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                    }else if(numbinario == 0 ){
                        binario = "0" + binario;
                    }else{
                        binario = "No se puede convedrtir un numero negativo, solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;
                case 3:
                    System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                    fahrenheit = entrada.nextDouble();
                    System.out.println("Elija la conversión deseada:");
                    System.out.println("1. Fahrenheit a Celsius");
                    System.out.println("2. Fahrenheit a Kelvin");
                    System.out.println("3. Fahrenheit a Rankine");
                    int conversion = entrada.nextInt();

                    switch (conversion) {
                        case 1:
                            celsius = (fahrenheit - 32) * 5 / 9;
                            System.out.println("La temperatura en grados Celsius es: " + celsius);
                            break;
                        case 2:
                            kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
                            System.out.println("La temperatura en Kelvin es: " + kelvin);
                            break;
                        case 3:
                            rankine = fahrenheit + 459.67;
                            System.out.println("La temperatura en Rankine es: " + rankine);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de números a evaluar: ");
                    cantidad = entrada.nextInt();

                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Ingrese un número: ");
                        int numero = entrada.nextInt();

                        if (numero > 0) {
                            positivos++;
                        } else if (numero < 0) {
                            negativos++;
                        }
                    }

                    System.out.println("Cantidad de números positivos: " + positivos);
                    System.out.println("Cantidad de números negativos: " + negativos);
                    break;
                case 5:
                    System.out.println("Bienvenido a la tiendita");
                    System.out.println("Por favor ingrese el numero de productos que desea comprar?");
                    total = entrada.nextInt();

                    for(int i = 1; i <= total; i++){
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreproducto = entrada.next();
                        System.out.println("Ingrese el precio: ");
                        precio = entrada.nextFloat();
                        System.out.println("Ingrese la cantidad del producto: ");
                        cantidadproducto = entrada.nextInt();
                        resultado = precio * cantidadproducto;
                        compra = compra + resultado;
                    }
                    System.out.println("El total de la compra es: " + compra);
                    compra = 0;
                    break;
                case 6:
                    System.out.println("Elija una opción:");
                    System.out.println("1. Calcular área y perímetro de un rectángulo");
                    System.out.println("2. Calcular área y perímetro de un triángulo");
                    System.out.println("3. Calcular volumen de una esfera");
                    System.out.println("4. Calcular volumen de un cilindro");
                    int opcionGeometria = entrada.nextInt();

                    switch (opcionGeometria) {
                        case 1:
                            System.out.print("Ingrese la longitud del rectangulo: ");
                            longitud = entrada.nextDouble();
                            System.out.print("Ingrese la anchura del rectangulo: ");
                            anchura = entrada.nextDouble();
                            areaRectangulo = longitud * anchura;
                            perimetroRectangulo = 2 * (longitud + anchura);
                            System.out.println("Area del rectangulo: " + areaRectangulo);
                            System.out.println("Perímetro del rectangulo: " + perimetroRectangulo);
                            break;
                        case 2:
                            System.out.print("Ingrese la base del triangulo: ");
                            base = entrada.nextDouble();
                            System.out.print("Ingrese la altura del triangulo: ");
                            altura = entrada.nextDouble();
                            areaTriangulo = 0.5 * base * altura;
                            perimetroTriangulo = base + 2 * (Math.sqrt((base * base) + (altura * altura)));
                            System.out.println("Area del triangulo: " + areaTriangulo);
                            System.out.println("Perímetro del triangulo: " + perimetroTriangulo);
                            break;
                        case 3:
                            System.out.print("Ingrese el radio de la esfera: ");
                            radioEsfera = entrada.nextDouble();
                            volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radioEsfera, 3);
                            System.out.println("Volumen de la esfera: " + volumenEsfera);
                            break;
                        case 4:
                            System.out.print("Ingrese el radio del cilindro: ");
                            radioCilindro = entrada.nextDouble();
                            System.out.print("Ingrese la altura del cilindro: ");
                            alturaCilindro = entrada.nextDouble();
                            volumenCilindro = Math.PI * Math.pow(radioCilindro, 2) * alturaCilindro;
                            System.out.println("Volumen del cilindro: " + volumenCilindro);
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                    break;
                case 7:
                    int t;
                    for(t=1; t<=10; t++){
                        System.out.println(t +" "+ (t*10) + " "+ (t*100)+ " "+ (t*1000)+ " ");
                    }
                    break;
                case 8:
                    System.out.print("Ingrese un número entero no negativo: ");
                    numerofac = entrada.nextInt();

                    if (numerofac < 0) {
                        System.out.println("El número debe ser no negativo");
                    } else {
                        long factorial = 1;

                        for (int i = 1; i <= numerofac; i++) {
                            factorial *= i;
                        }

                        System.out.println("El factorial de " + numerofac + " es " + factorial);
                    }
                    break;
                case 9:
                    System.out.println("Cuadro magico");
                    System.out.println("Ingrese el tamaño del cuadro a pintar");
                    num1 = entrada.nextInt();
                    if(num1 >= 1 && num1 <= 20){
                        for(int c=1; c<=num1; c++){
                            for (int g=1; g<=num1; g++){
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    }else{
                        System.out.println("Ingrese solo numeros entre el 1 y 20: ");
                    }

                    break;
                case 10:
                   System.out.println("Ingrese el tamaño de la figura hueca:");
                             figurah =entrada.nextInt();

                             if( figurah>= 0 && figurah<= 50);
                                   for(int f=0; f<figurah; f++){
                                    System.out.print("*");

                                   }
                                   System.out.println();

                                   for(int f =0; f<figurah-2; f++){
                                    System.out.print("*");
                                    for(int g=0; g<figurah-2; g++){
                                      System.out.print (" ");
                                    }
                                    System.out.println("*");
                                   }

                                    for(int f=0; f<figurah; f++){
                                    System.out.print("*");
                                    }
                    break;
                case 11:
                    System.out.println("Patrones de Codigo");
                    System.out.printf("%s%s%s%s%s%s%s%s%n","","","","","","","","");
                    System.out.printf("%2s%s%s%s%s%s%s%s%n","","","","","","","","");
                    System.out.printf("%s%s%s%s%s%s%s%s%n","","","","","","","","");
                    System.out.printf("%2s%s%s%s%s%s%s%s%n","","","","","","","","");
                    System.out.printf("%s%s%s%s%s%s%s%s%n","","","","","","","","");
                    System.out.printf("%2s%s%s%s%s%s%s%s%n","","","","","","","","");
                    System.out.printf("%s%s%s%s%s%s%s%s%n","","","","","","","","");
                    System.out.printf("%2s%s%s%s%s%s%s%s%n","","","","","","","","");

                    break;
                case 12:
                    System.out.println("Diamante :)");
                             final int n9 = 5;
 
                              for ( o = 1; o <= n9; o++)
                               {
                              for (int j = o; j < n9; j++) {
                               System.out.print(' ');
                              }
                              for (int k = 1; k < 2*o; k++) {
                               System.out.print('*');
                                 }
                               System.out.print(System.lineSeparator());
                              }
                              for ( o = n9 - 1; o >= 1; o--)
                              {
                              for (int j = n9; j > o; j--) {
                                System.out.print(' ');
                              }
                              for (int k = 1; k < (o * 2); k++) {
                               System.out.print('*');
                              }
                               System.out.print(System.lineSeparator());
                              }
                             break;
                             case 13:
                             System.out.println("Bienvenido a la calculadora de Diego");
                             System.out.println("1. Si deseas hacer una suma.");
                             System.out.println("2. Si deseas hacer una resta.");
                             System.out.println("3. Si deseas hacer una multiplicacion.");
                             System.out.println("4. Si deseas hacer una division.");

                             System.out.print("Ingrese 1, 2, 3 o 4 dependiendo lo que desea elegir:");
                             int opc= entrada.nextInt();

                             if(opc == 1){
                             System.out.println("Usted eligio hacer una suma");
                             System.out.println("Ingrese su primer cantidad o numero: ");
                             cant1 = entrada.nextFloat();
                             System.out.println("Ingrese su segunda cantidad o numero: ");
                             cant2 = entrada.nextFloat();
                             sum =(cant1 + cant2);
                             System.out.println("El resultado de su suma es...: " +sum );
                             break;
                             }

                             if(opc == 2){
                             System.out.println("Usted eligio hacer una resta");
                             System.out.println("Ingrese su primer cantidad o numero: ");
                             cant1 = entrada.nextFloat();
                             System.out.println("Ingrese su segunda cantidad o numero: ");
                             cant2 = entrada.nextFloat();
                             float rest = (cant1 - cant2);
                             System.out.println("El resultado de su resta es...: " +rest);
                             break;
                             }
                 
                             if(opc == 3){
                             System.out.println("Usted eligio hacer una multiplicacion");
                             System.out.println("Ingrese su primer cantidad o numero: ");
                             cant1 = entrada.nextFloat();
                             System.out.println("Ingrese su segunda cantidad o numero: ");
                             cant2 = entrada.nextFloat();
                             float mult = (cant1 * cant2);
                             System.out.println("El resultado de su multiplicacion es...: " +mult);
                             break;
                             }

                             if(opc == 4){
                             System.out.println("Usted eligio hacer una division");
                             System.out.println("Ingrese su primer cantidad o numero: ");
                             cant1 = entrada.nextFloat();
                             System.out.println("Ingrese su segunda cantidad o numero: ");
                             cant2 = entrada.nextFloat();
                             float div = (cant1 / cant2);
                             System.out.println("El resultado de su division es...: " +div);
                             break;
                             }
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Elija una opcion valida");
                    break;
            

            }
            




            System.out.println("Deseas repetir el programa?,escribe s para si");
            letra = entrada.next().charAt(0);



        }while(letra == 's' || letra == 'S');
    }


}