
<p align="center">
  <a href="https://github.com/dcg0/DCecuelm327/actions/workflows/security.yml"><img src="https://github.com/dcg0/DCecuelm327/actions/workflows/security.yml/badge.svg" alt="Security checks"></a>
  <a href="https://github.com/dcg0/DCecuelm327/security"><img src="https://img.shields.io/badge/security-policy-available-176b46" alt="Security policy available"></a>
</p>

apk descarga directa funcional
https://github.com/dcg0/DC-elm327HC/releases/tag/v0.1.0

![HC-ELM327 / DC-ELM327](logo/web_hi_res_1280x800.png)

Listo. Convertí y dejé preparado **DC-ELM327** como proyecto Android compilable.

### Resultado

- Proyecto subido a GitHub: [dcg0/DC-ELM327](https://github.com/dcg0/DC-ELM327)
- Repositorio configurado como **privado**.
- APK publicada para descarga: [Descargar DC-ELM327-debug.apk](https://github.com/dcg0/DC-ELM327/releases/download/v2.7.10-debug/DC-ELM327-debug.apk)
- Release: [DC-ELM327 v2.7.10 debug](https://github.com/dcg0/DC-ELM327/releases/tag/v2.7.10-debug)
- README actualizado con instrucciones y enlace de descarga: [README actualizado](</home/ubuntu/work_dc_elm327/DC-ELM327/README.md>)

### Validaciones realizadas

- `./gradlew clean assembleDebug` — correcto.
- `./gradlew test` — correcto.
- Compilación y pruebas desde un clon limpio descargado desde GitHub — correcto.
- APK verificada con `apksigner`.
- GitHub Actions configurado para ejecutar pruebas, compilar la APK y publicar el artefacto en cada push o pull request.
- Commit remoto final: `777d6bf`.

También puedes descargar la APK localmente aquí:

[APK compilada DC-ELM327](</home/ubuntu/artifacts/DC-ELM327-debug.apk>)

Hash SHA-256:

```text
9fdd14615aff0e80bc2e87cdcf70a295ec30df5e6ad350a45e5b3f4c57c0f6f9
```

La APK publicada es de **debug**, adecuada para pruebas. Para Google Play o distribución de producción será necesario generar una firma release propia. Las funciones que requieren hardware real —Bluetooth, USB, Wi-Fi y lectura del vehículo— necesitan probarse con un adaptador ELM327 conectado; el modo Demo sí puede probarse sin vehículo.  