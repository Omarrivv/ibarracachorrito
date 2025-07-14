Resumen del Proyecto
Vas a crear un sistema bancario con microservicios que maneje:

Clientes: Personal y empresarial
Productos Pasivos: Cuentas de ahorro, corriente y plazo fijo
Productos Activos: Créditos personales/empresariales y tarjetas de crédito
Operaciones: Depósitos, retiros, pagos y consultas

Arquitectura Sugerida de Microservicios
Te recomiendo crear estos microservicios separados:

customer-service - Gestión de clientes
account-service - Cuentas bancarias (productos pasivos)
credit-service - Créditos y tarjetas (productos activos)
transaction-service - Movimientos y operaciones
config-server - Configuración centralizada

Stack Tecnológico Requerido

Framework: Spring Boot con WebFlux (programación reactiva)

Base de datos: MongoDB con Spring Data

Gestión: Maven

Configuración: Config Server

Documentación: OpenAPI

Logging: Logback

Utilidades: Lombok

Reglas de Negocio Importantes
Clientes Personales:

Solo 1 cuenta de ahorro O 1 cuenta corriente O múltiples cuentas plazo fijo
Solo 1 crédito personal
Puede tener tarjeta de crédito

Clientes Empresariales:

Solo cuentas corrientes (múltiples)
Múltiples créditos empresariales
Puede tener tarjeta de crédito empresarial
Cuentas con titulares y firmantes autorizados

Próximos Pasos Sugeridos

Diseño: Crear el diagrama de arquitectura en draw.io
Estructura: Configurar los repositorios Git para cada microservicio
Config Server: Implementar primero la configuración centralizada
Servicios base: Empezar con customer-service (más simple)
Contratos: Definir las APIs OpenAPI
Testing: Usar Postman para pruebas


