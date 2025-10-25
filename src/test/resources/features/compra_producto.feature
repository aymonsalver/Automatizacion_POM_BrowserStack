#language: es
  Característica: Como usuario quiero validar el proceso de compra de un producto de la pagina de BrowserStack

    @CompraExitosa
    Escenario: Compra exitosa de un producto
      Dado que el usuario se encuentra autenticado
      Cuando el usuario filtra los productos por precio y marca "Apple"
      Y el usuario agrega al carrito el primer producto
      Y realiza el proceso de checkout
      Entonces el usuario debera ver el mensaje de comfirmacion "Your Order has been successfully placed."


    @CompraSinAutenticacion
    Escenario: Intento de compra sin autenticacion
      Dado que el usuario NO se encuentra autenticado
      Cuando el usuario filtra los productos por precio y marca "Apple"
      Y el usuario intenta agregar al carrito el primer producto
      Entonces el usuario deberia ser redirigido a la pagina de login
