First class Product that we will inherit it in ClothingProduct, BookProduct and ElectronicProduct
It will contain productId: positive integer (else take absolute value)
name: String
 price: positive float (else take absolute value)
Methods: Setters and getters for the attributes.
==========================================================
Second class will be ElectronicProduct
it will contain: brand: String
 warrantyPeriod: positive integer (else take absolute value)
Methods: Setters and getters for the attributes.
==========================================================
Third class will be ClothingProduct it will contain  size: String
 fabric: String
Methods: Setters and getters for the attributes.
==========================================================
fourth class will be BookProduct it will contain author: String
 publisher: String
Methods: Setters and getters for the attributes.
==========================================================
fifith class will be Customer it will contain  customerId: positive integer (else take absolute value)
 name: String
address: String
Methods: Setters and getters for the attributes.
==========================================================
sixth class will be Cart it will contain  customerId: positive integer (else take absolute value)
nProducts: positive integer which represents the number of products (else take absolute value)
 products: an array of Product objects of size nProducts.
Methods: Setters and getters for the attributes, addProduct, removeProduct, calculatePrice and placeOrder.
==========================================================
seventh class will be Order it will contain customerId: positive integer (else take absolute value)
 orderId: positive integer (else take absolute value)
products: an array of Product objects of size nProducts.
totalPrice: positive float (else take absolute value)
Methods: printOrderInfo.
==========================================================
last class will be the main class 8. EcommerceSystem: This class serves as the entry point for the project. It contains the main method and demonstrates the usage of the other classes. You’ll have to create the products but take orders from the user.
==========================================================
