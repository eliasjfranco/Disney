# Disney

El programa no funciona el servicio de envio de email con la api sendgrid. 
Ya que github detecta la key en el proyecto y es bloqueada la key encargada del envio de emails.

Para testear, deben poner su key de sendgrid en el archivo "SendMailService" linea 23.
https://github.com/eliasjfranco/Disney/blob/main/AlkemyDisney/src/main/java/com/disney/sendgrid/SendMailService.java
