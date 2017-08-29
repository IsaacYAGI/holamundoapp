# HolaMundoApp

Una simple aplicación de Android hecha en Android Studio 2.1.2 con una pantalla y un botón. Al presionar el botón se muestra un mensaje.

Se puede utilizar para hacer pruebas pequeñas y desarrollar cualquier cosa simple apartir de esto.

En este repositorio se encuentran varias ramas que parten de `master` que es la más básica de todas. Si se quiere probar el codigo de una rama específica se debe apuntar a dicha rama.

Cada rama posee un Readme con una explicación de lo que hace dicha rama.

Have fun! :)

## Rama obtener-numero-telefono

- En esta rama se encuentra una app de Android muy básica que lee el número de teléfono del dispositivo configurado en Settings -> About Phone -> Status -> My phone Number. 
- Si no se encuentra configurado se muestra entonces lo que devuelva el metodo `getSubscriberId()`.
- Si no retorna nada, entonces muestra el mensaje: 
> NO SE ENCONTRO EL NUMERO DE TELEFONO