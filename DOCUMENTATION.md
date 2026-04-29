# Decisiones de Diseño - BiblioTech

## Tecnologías
- **Java 17** con Maven, **IntelliJ IDEA** como IDE, **Git + GitHub** con flujo de Issues, ramas y Pull Requests.

---

## Arquitectura en Capas
Se separó el sistema en capas: `model` (entidades), `repository` (almacenamiento in-memory), `service` (lógica de negocio), `persistence` (CSV), `exception` (errores del dominio) y `Main.java` (CLI).

---

## Modelo de Dominio
- `Libro`, `Ebook` y `Prestamo` se implementaron como **Java Records** para garantizar inmutabilidad.
- `Recurso` es una **interface** que unifica `Libro` y `Ebook` bajo un mismo tipo, permitiendo polimorfismo.
- `Socio` es una **clase abstracta** con subclases `Estudiante` (máx. 3 préstamos) y `Docente` (máx. 5 préstamos).
- Se usaron **enums** para `CategoriaLibro` y `TipoSocio`.

---

## Repositorios
Se definió una interface genérica `Repository<T, ID>` extendida por `LibroRepository`, `EbookRepository`, `SocioRepository` y `PrestamoRepository`. Las implementaciones usan `HashMap` para búsqueda O(1).

---

## Servicios y SOLID
Los servicios reciben repositorios por constructor (interfaces, no clases concretas), aplicando **Dependency Inversion**. Las subclases de `Socio` aplican **Open/Closed**. Cada clase tiene una única responsabilidad (**Single Responsibility**).

---

## Manejo de Errores
Jerarquía de excepciones bajo `BibliotecaException`: `LibroNoDisponibleException`, `LibroNoEncontradoException`, `SocioNoEncontradoException`, `SocioSinCupoException`, `DniDuplicadoException`, `EmailInvalidoException`, `IsbnDuplicadoException`, `CategoriaInvalidaException`.

---

## Bonus: Sanciones
Al devolver con retraso, el socio queda bloqueado automáticamente por la cantidad de días de retraso.

---

## Bonus: Persistencia CSV
Libros, Ebooks y Socios se persisten en `data/libros.csv`, `data/ebooks.csv` y `data/socios.csv`. La carpeta se crea automáticamente y está excluida del repositorio con `.gitignore`.