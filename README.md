# Centro de Custo *teste Carrefour
Repositorio do codigo fonte e instruções.
 
   Esta solução contem cadastro de usuario, titulos e centro de custo.
   
   Para utilizar a aplicação, comece cadastrando um usuario:
   
   ![image](https://user-images.githubusercontent.com/25961706/236300145-fda7cb72-0a91-4942-957d-f2254b6e84cd.png)

   Pegue o token de retorno e aplique as demais chamada rest da aplicação.   
       

segue as url de referencias

  cadastros usuarios:
   
      url/api/usuarios
      
            json: {
	
                   "nome": "fernando",
                   "senha":"123456",
                   "email": "fernando1@gmail.com",
                   "dataCadastro": "2023-05-04T18:02:57.468+00:00",
                   "dataInativacao": null
                  }
      
      
     alterar usuarios 
     
     url/api/usuarios/id
     
           json: {

                 "nome": "fernando alencar",
                 "email": "fernando1@gmail.com",
                 "senha":"123456",
                 "foto": null,
                 "dataCadastro": "2023-05-04T18:04:19.586+00:00",
                 "dataInativacao": null
                }

     excluir usuario : api/usuarios/2
     
    
 
  Cadastro do centro de custo
  
     url/api/centrodecustos
     
        json: {
	
                "descricao": "computador",
                "observacao":"123456"

               }
 
 
 
 Cadastro Titulos
 
     url/api/titulos: {
              
                       "descricao": "salario",
                       "tipo": "APAGAR",
                       "valor":"100.00",
                       "dataReferencia":"2023-05-04T00:00:00",
                       "dataVencimento":"2023-05-05T00:00:00",
                       "centrosDeCustos":[
                        {
                         "id":1
                        }
                       ]   
                   }
 



O projeto joi desenvolvido nas tecnologias e ferramentas:
 
      Documentação de referencia
      
      * Official Apache Maven documentation(https://maven.apache.org/guides/index.html)
      * Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.6/maven-plugin/reference/html/)
      * Create an OCI image(https://docs.spring.io/spring-boot/docs/3.0.6/maven-plugin/reference/html/#build-image)
      * Spring Boot DevTools(https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#using.devtools)
      * Spring Web(https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#web)
      * Spring Data JPA(https://docs.spring.io/spring-boot/docs/3.0.6/reference/htmlsingle/#data.sql.jpa-and-spring-data)
      * PostGresql

      Guias     

      * Building a RESTful Web Service(https://spring.io/guides/gs/rest-service/)
      * Serving Web Content with Spring MVC(https://spring.io/guides/gs/serving-web-content/)
      * Building REST services with Spring(https://spring.io/guides/tutorials/rest/)
      * Accessing Data with JPA(https://spring.io/guides/gs/accessing-data-jpa/)

      The JVM level was changed from '11' to '17', review the [JDK Version Range](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Versions#jdk-version-range) on the wiki for more details.


    
