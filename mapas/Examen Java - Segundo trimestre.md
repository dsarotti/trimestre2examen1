# Examen Java: Estructuras de datos y acceso a ficheros

## Estructuras de datos

### 1 Genéricos: Uno

Empleando genéricos define una clase que pueda guardar **cualquier tipo de dato**.

(Constructor, getters y setters, y un método que indique si está vacía).

### 2 `Collections`: Listas

2.1. Indica qué tipo de lista (`ArrayList` o `LinkedList`) deberías utilizar y por qué en cada una de las siguientes situaciones:

a) Queremos almacenar en una lista el catálogo de una biblioteca al que accederemos constantemente indicando el número del libro.
    R: Si el número del libro se refiere al índice en el que está guardado, entonces el ArrayList es más adecuado ya que los accesos a la información se realizan más rápido y de forma más eficiente.

b) Queremos almacenar resultados de varias búsquedas de artículos en una base de datos que iremos añadiendo a la lista. También haremos filtrados que eliminarán grandes cantidades de elementos de la lista resultado.
    R: En este caso la lista enlazada tiene más sentido porque el conjunto de datos irá cambiando de tamaño con frecuencia y esta sería una operación demasiado costosa con un ArrayList.

2.2. Crea una estructura que funcione como una cola extendiendo `LinkedList`. Tendrá dos métodos `encolar` y `desencolar`. El primero añadirá un elemento al final de la cola y el segundo devolverá el primer elemento de la cola.

2.3. Añade el código que estimes necesario para que la siguiente lista se ordene de mayor a menor.

```java
List<Integer> lista = new ArrayList<>();

for (int i = 0; i < 10; i++) {
    lista.add(i);
}
```
    R: Añadido el codigo necesario en el fichero 'Main.java' del directorio 'listas'.

### 3 `Collections`: Conjuntos

3.1. ¿Es posible listar el contenido de un conjunto?
    R: con un foreach se puede recorrer facilmente.

3.2. ¿Cómo lo harías? *(escribe un programa que liste el contenido de un conjunto)*
    R: Añadido el código en el fichero 'Main.java' del directorio 'conjuntos'.

3.3. ¿En qué orden se mostrarían los datos si recorremos en el siguiente conjunto?

```java
Set<String> conjunto = new HashSet<>();

conjunto.add("uno");
conjunto.add("dos");
conjunto.add("tres");
conjunto.add("cuatro");
conjunto.add("cinco");
```
    R: No se muestra en ningún orden concreto 

3.4. ¿A qué se debe esto?
    R: Se debe a que HashSet no garantiza ningún orden de iteración, se irán obteniendo los datos como le cuadre a la máquina virtual de Java pero no se asegura que se mantenga el mismo orden a lo largo del tiempo.

### 4 Mapas: uno

4.1. Declara un mapa que acepte cadenas como clave y listas de enteros como valor.
    R: Añadido el código en el fichero 'Main.java' del directorio 'mapas'.

4.2. Inserta tres elementos en dicho mapa.
    R: Añadido el código en el fichero 'Main.java' del directorio 'mapas'.

4.3. Cambia el valor del segundo elemento.
    R: Añadido el código en el fichero 'Main.java' del directorio 'mapas'.

4.4. Escribe un programa que recorra y muestre el contenido del mapa anterior (tendrá que funcionar independientemente del tamaño del mapa).

4.5. ¿Indica en qué orden se mostrarían los elementos del siguiente mapa y por qué?

```java
Map<Integer, String> mapa = new LinkedHashMap<>();

mapa.put(3, "tres");
mapa.put(2, "dos");
mapa.put(1, "uno");
```
    R: Al ser un LinkedHashMap se garantiza que el orden de iteración coincide con el orden en que se han insertado los datos, por lo tanto se mostraría "tres","dos","uno".
## Ficheros

1.1. Escribe un programa que inserte esta línea como la primera de un fichero de texto: "¡Hola mundo!".

1.2. Escribe un programa que haga lo mismo pero leyendo y escribiendo arrays de bytes en el fichero.

1.3. Asegúrate de que se liberan correctamente los recursos utilizados.
