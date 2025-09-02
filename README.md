# aieponline
📋 Requerimientos del Proyecto – Distribuidora de Alimentos

Este proyecto corresponde al desarrollo de una aplicación en Java (sin uso de IDE) que permite capturar datos, calcular costos de despacho según reglas de negocio y organizar la documentación en un repositorio de GitHub.

✅ Requerimientos Funcionales

Ingreso de datos básicos:

El sistema debe permitir ingresar información de un vehículo (marca, modelo, cilindrada, tipo de combustible, capacidad de pasajeros).

Visualización de datos:

El sistema debe mostrar en pantalla todos los datos ingresados por el usuario, confirmando que fueron registrados correctamente.

Cálculo de despacho:

El sistema debe calcular automáticamente el costo del despacho en base a las siguientes reglas de negocio:

Si la compra es mayor o igual a $50.000 y la distancia es hasta 20 km → despacho gratuito.

Si la compra es entre $25.000 y $49.999 → costo de $150 por kilómetro recorrido.

Si la compra es menor a $25.000 → costo de $300 por kilómetro recorrido.

Registro de usuarios:

El sistema debe permitir el registro de usuarios utilizando cuentas de Gmail.

Compilación y ejecución:

El programa debe compilarse con javac y ejecutarse con java en consola, sin usar herramientas IDE.

Gestión de proyecto en GitHub:

El repositorio debe contener el código fuente, la documentación y el cronograma del proyecto.

⚙️ Requerimientos No Funcionales

Lenguaje de programación:

El desarrollo debe realizarse en Java SE, con el compilador oficial javac.

Compatibilidad:

El programa debe ser ejecutable en la JVM (Java Virtual Machine).

Documentación:

Cada línea del código debe estar comentada para explicar su función.

El repositorio debe incluir documentación clara en un archivo README.md.

Control de versiones:

El proyecto debe ser gestionado en GitHub, utilizando ramas y commits descriptivos.

Mantenibilidad:

El código debe ser simple, modular y con buenas prácticas para facilitar futuras mejoras.

Usabilidad:

La aplicación debe interactuar mediante consola con entradas claras para el usuario y mensajes de salida comprensibles.


📖 Historias de Usuario – Proyecto Distribuidora de Alimentos

Las siguientes historias de usuario fueron elaboradas considerando el caso de estudio de la distribuidora de alimentos, sus clientes y los objetivos del sistema a desarrollar.

👤 Historia de Usuario 1 – Registro de usuario con Gmail

Como cliente de la distribuidora
Quiero registrarme en la aplicación utilizando mi cuenta de Gmail
Para acceder fácilmente sin necesidad de crear un usuario desde cero.

Criterios de aceptación:

El sistema debe permitir iniciar sesión con una cuenta Gmail válida.

Una vez autenticado, el sistema debe mostrar un mensaje de bienvenida con el nombre del usuario.

👤 Historia de Usuario 2 – Ingreso de datos del vehículo

Como cliente de la distribuidora
Quiero ingresar la información básica de mi vehículo (marca, modelo, cilindrada, tipo de combustible, capacidad de pasajeros)
Para que el sistema registre y muestre mis datos correctamente.

Criterios de aceptación:

El sistema debe solicitar cada dato de manera clara.

Al finalizar, debe desplegar en pantalla un resumen con los datos ingresados.

👤 Historia de Usuario 3 – Cálculo de despacho gratuito

Como cliente que realiza una compra mayor a $50.000 dentro de 20 km
Quiero que la aplicación calcule automáticamente el despacho gratuito
Para confirmar que no debo pagar adicional por el envío.

Criterios de aceptación:

Si el monto de la compra ≥ $50.000 y la distancia ≤ 20 km, el sistema debe mostrar costo de despacho = $0.

👤 Historia de Usuario 4 – Cálculo de despacho con tarifa media

Como cliente que realiza una compra entre $25.000 y $49.999
Quiero que el sistema me cobre $150 por km recorrido
Para conocer el valor adicional que debo pagar por el envío.

Criterios de aceptación:

El sistema debe pedir la distancia (en km).

El costo de despacho debe calcularse como 150 × distancia y mostrarse junto al valor total.

👤 Historia de Usuario 5 – Cálculo de despacho con tarifa alta

Como cliente que realiza una compra menor a $25.000
Quiero que el sistema me cobre $300 por km recorrido
Para visualizar el costo final del despacho.

Criterios de aceptación:

El sistema debe pedir la distancia (en km).

El costo de despacho debe calcularse como 300 × distancia y mostrarse junto al valor total.

