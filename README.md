# Parque Turístico de Dinosaurios

## Herramientas utilizadas
- Java 25 (OpenJDK)
- Maven (gestión de dependencias)
- JUnit 5.10.0 (pruebas unitarias)
- IntelliJ IDEA (IDE)

## Instrucciones de configuración
1. Tener Java 17 o superior instalado
2. Clonar el repositorio o abrir el proyecto en IntelliJ
3. Ejecutar la clase `Main.java`

## Forma de ejecución
1. Abrir el proyecto en IntelliJ IDEA
2. Navegar a `src/main/java/com/parque/Main.java`
3. Hacer clic derecho → "Run Main.main()"

## Ejecutar pruebas unitarias
1. Navegar a `src/test/java/com/parque/ParqueTest.java`
2. Hacer clic derecho → "Run ParqueTest"
3. O desde consola: `mvn test`

## Explicación general del sistema
El sistema simula la administración básica de un parque de dinosaurios. Permite:

- Registrar dinosaurios (nombre y especie)
- Registrar visitantes
- Vender boletos ($50 cada uno)
- Alimentar dinosaurios ($10 por dinosaurio)
- Simular eventos aleatorios (escape, apagón o día normal)
- Mostrar el estado actual del parque (dinero, dinosaurios, visitantes)

Todo funciona en memoria, sin base de datos.

## Pruebas unitarias (JUnit 5)
Se implementaron **7 pruebas unitarias** que verifican:

| Prueba | Qué valida |
|--------|-------------|
| `testRegistrarDinosaurio` | Registro correcto de dinosaurios |
| `testRegistrarVisitante` | Registro correcto de visitantes |
| `testVenderBoletoVisitanteExistente` | Venta de boleto a visitante registrado |
| `testVenderBoletoVisitanteNoExistente` | Manejo de error al vender a visitante inexistente |
| `testAlimentarDinosaurios` | Alimentación y reducción de saldo |
| `testSimularEventoAleatorio` | Eventos aleatorios sin errores |
| `testMostrarEstado` | Visualización del estado del parque |

**Resultado:** 7/7 pruebas pasaron

## Patrones de diseño utilizados
No se implementaron patrones de diseño debido a falta de tiempo y experiencia práctica. Entiendo su propósito teórico (Singleton, Factory, Observer) pero no los integré en esta versión.

## Requisitos no cumplidos
- Persistencia en base de datos (Liquibase + JDBC)
- Configuración externa (.properties / .yaml)
- Simulación avanzada por pasos de tiempo
- Múltiples zonas del parque
- Sistema de monitoreo en intervalos

## Autor
Carlos Solano M.