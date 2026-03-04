# Informe Técnico - Reto 2: Depuración y Corrección

**Autor:** Alberto Guerra Perera
**Fecha:** 04/03/2026
**Proyecto:** BuggyWebApp

## 1. Identificación del Error
Durante la ejecución de la aplicación, se detectó que el formulario de contacto permitía el envío de datos vacíos, lo que podría causar errores en la base de datos o correos electrónicos sin información.

## 2. Análisis con el Debugger
Utilizando el **Debugger de IntelliJ**, se colocó un *breakpoint* en la clase `MainApp` justo antes de la llamada a `submitContactForm`. 
- **Observación:** Se confirmó que las variables `name` y `email` llegaban con valores vacíos `""`.
- **Causa Raíz:** La clase `ContactController` no realizaba ninguna comprobación antes de pasar los datos al servicio.

## 3. Solución Aplicada
Se ha implementado una validación en `ContactController.java` utilizando un bloque `if-else`. Ahora, el sistema verifica que:
- El nombre no sea nulo ni esté vacío.
- El email no sea nulo ni esté vacío.

Si la validación falla, se muestra un mensaje de error por consola y se detiene el proceso de envío.

## 4. Conclusión
La aplicación es ahora más robusta y segura, evitando el procesamiento de formularios incompletos.
