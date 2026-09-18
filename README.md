apk descarga directa funcional
https://github.com/dcg0/DC-elm327HC/releases/tag/v0.1.0

![HC-ELM327 / DC-ELM327](logo/web_hi_res_1280x800.png)

Descargar APK
La versión de prueba más reciente está disponible en GitHub Releases. También puedes descargar directamente la APK debug desde DC-ELM327-debug.apk.
![HC-ELM327 / DC-ELM327](https://private-us-east-1.manuscdn.com/sessionFile/MjbV3PgqJGQaw95CFA5nFV/sandbox/iBRjGetfij70lP3CYlTWvS-images_1789763040203_na1fn_L2hvbWUvdWJ1bnR1L3dvcmtfZGNfZWxtMzI3L0RDLUVMTTMyNy9sb2dvL3dlYl9oaV9yZXNfMTI4MHg4MDA.png?Expires=1789935842&Signature=MEQCIHfywRnSsR9tRQnmqY1N4qLSgfwh~ApjHHY0ymOT20Q4AiAhwAgavXVSGZsqMHgp08wbCwKWdH8zPLs1~JsA-bafRA__&Key-Pair-Id=K1K5N5YNBUUMMN)

# DC-ELM327

**DC-ELM327** es una aplicación Android de diagnóstico OBD-II basada en AndrOBD. Permite conectar el teléfono a un adaptador compatible con **ELM327** para leer datos del vehículo, consultar y borrar códigos de avería y visualizar mediciones en tiempo real.

La aplicación es software libre e incluye un **modo Demo** para probar la interfaz sin conectar un vehículo.

## Funciones

- Conexión por Bluetooth clásico, Bluetooth Low Energy, USB y Wi-Fi/red.

- Lectura y borrado de códigos de avería (DTC).

- Datos en vivo, selección de PIDs y gráficas.

- Vista de tablero, HUD y dashboard WebView en tiempo real.

- Lectura de información del vehículo, freeze frames y pruebas de control compatibles.

- Guardado/carga de mediciones y exportación CSV.

- Modo Demo para pruebas sin adaptador.

- Configuración de unidades, modo día/noche, pantalla completa y preferencias de comunicación.

- Soporte para plugins AndrOBD.

- Interfaz traducida a múltiples idiomas.

> La comunicación real depende de un adaptador ELM327 compatible y de los permisos de Bluetooth/USB/red del dispositivo Android. El modo Demo permite validar la aplicación sin hardware.

## Requisitos de compilación

- JDK 17 completo, incluido `javac`.

- Android SDK Platform 36 y Build Tools 36.0.0.

- Gradle Wrapper incluido en el proyecto.

El submódulo `plugin` se integra directamente en el build raíz para que la aplicación compile desde un clon limpio, sin depender de una copia externa del plugin.

## Compilar la APK

En Linux/macOS:

```bash
chmod +x gradlew
./gradlew clean test assembleDebug
```

La APK de depuración se genera en:

```
androbd/build/outputs/apk/debug/androbd-debug.apk
```

## Descargar APK

La versión de prueba más reciente está disponible en [GitHub Releases](https://github.com/dcg0/DC-ELM327/releases/latest). También puedes descargar directamente la APK debug desde [DC-ELM327-debug.apk](https://github.com/dcg0/DC-ELM327/releases/download/v2.7.10-debug/DC-ELM327-debug.apk).

> Esta APK está firmada con la clave debug y es para pruebas. Para publicar una versión de producción o subirla a Google Play, genera y protege una clave release propia.

En Windows:

```
gradlew.bat clean test assembleDebug
```

`local.properties` es local a cada equipo y no se debe subir al repositorio. Android Studio puede abrir directamente la carpeta raíz del proyecto.

## Instalar en un dispositivo conectado

Con `adb` disponible y la depuración USB habilitada:

```bash
adb install -r androbd/build/outputs/apk/debug/androbd-debug.apk
```

Para probar el modo Demo, abre la aplicación y selecciona el modo de demostración desde la pantalla inicial o las opciones de conexión. Para una conexión real, concede los permisos solicitados y selecciona el medio Bluetooth, BLE, USB o red correspondiente.

## Integración continua

GitHub Actions ejecuta automáticamente `test` y `assembleDebug` en cada push y pull request. También se puede iniciar manualmente desde la pestaña **Actions**. El workflow publica la APK de depuración como artefacto descargable.

## Licencia

Consulta [LICENSE](LICENSE). El proyecto conserva la licencia y atribuciones de sus componentes originales.
