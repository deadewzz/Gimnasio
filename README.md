Gimnasio API 
Proyecto backend diseñado para gestionar el ecosistema de un gimnasio, permitiendo el registro de marcas personales por parte de atletas y la creación/asignación de rutinas por parte de entrenadores.
Descripción
Este sistema busca optimizar la relación entre entrenadores y atletas mediante una estructura de datos escalable. El proyecto está construido bajo el patrón de Arquitectura Hexagonal (Clean Architecture) para garantizar la separación de responsabilidades, la mantenibilidad del código y la independencia de la infraestructura.
Tecnologías
Java 17+
Spring Boot (Framework principal)
Spring Data JPA (Persistencia)
MySQL (Base de datos)
JWT (JSON Web Token) (Autenticación y seguridad)
Maven (Gestión de dependencias)
Arquitectura del Proyecto
El proyecto sigue una estructura de capas para aislar la lógica de negocio:
domain: Entidades de negocio puras y puertos (interfaces de repositorio).
application: Casos de uso (la lógica que orquesta el negocio).
infrastructure: Adaptadores técnicos (Controladores REST, implementación de JPA, configuración de seguridad, Mappers).
Funcionalidades Principales
Gestión de Usuarios: Registro y autenticación segura con roles (Atleta/Entrenador).
Seguridad: Implementación de JWT para proteger los endpoints.
CRUD de Atletas: Gestión completa de los perfiles de los deportistas.
En desarrollo: CRUD de Rutinas y Ejercicios.
En desarrollo: Seguimiento de marcas personales (PRs).

Estado del Proyecto
Actualmente en fase de desarrollo activo.
✅ CRUD de Atletas
✅ Configuración de Seguridad (JWT)
⏳ CRUD de Rutinas (En progreso)
⏳ Registro de Marcas (En diseño)
