# p4
# **Práctica 4 PAT**
# API REST para Tienda de Motocicletas

API creada con Spring Boot para gestionar motocicletas.

## Endpoints

| Método | Ruta     | Cuerpo JSON | Descripción           | Respuestas posibles |
|--------|----------|-------------|------------------------|---------------------|
| POST   | /motos   | {"marca":"..."} | Crear una moto       | 201 OK, 400         |
| GET    | /motos   |             | Listar todas las motos | 200 OK              |
| GET    | /motos/1 |             | Obtener moto por ID    | 200 OK, 404         |
| PUT    | /motos/1 | {"marca":"..."} | Actualizar moto     | 200 OK, 404         |
| DELETE | /motos/1 |             | Eliminar moto          | 204 No Content      |
