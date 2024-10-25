# Mond3D

**Mond3D** ist ein OpenGL C++ - Projekt, das eine 3D-Darstellung des Mondes unter Verwendung von OpenGL und Shadern generiert. Der Benutzer kann den Mond in Echtzeit drehen, zoomen und verschiedene Transformationen anwenden. 

## Inhaltsverzeichnis

- [Mond3D](#mond3d)
  - [Projektstruktur](#projektstruktur)
  - [Voraussetzungen](#voraussetzungen)
  - [Installation](#installation)
  - [Verwendung](#verwendung)
  - [Funktionen](#funktionen)
  - [Steuerung](#steuerung)
  - [Screenshots](#screenshots)
  - [Fehlerbehebung](#fehlerbehebung)
  - [Credits](#credits)
  - [Lizenz](#lizenz)

---

### Projektstruktur

```
Mond3D/
├── include/                      # Enthält Header-Dateien
│   ├── RenderObject.h            # Klasse zur Darstellung des Mondes
│   ├── Playground.h              # Hauptklasse mit der Spiel- und Anzeigelogik
│   └── common/                   # Enthält allgemeine Utility-Funktionen
│       ├── objloader.hpp         # Laden von .obj-Dateien
│       └── texture.hpp           # Textur-Verwaltungsfunktionen
├── resources/                    # Enthält Shader und Texturen
│   ├── SimpleVertexShader.vertexshader
│   ├── SimpleFragmentShader.fragmentshader
│   └── textures/                 # BMP- und RAW-Texturen
├── src/                          # Enthält Quellcodedateien
│   ├── RenderObject.cpp          # Render-Klasse
│   ├── Playground.cpp            # Hauptlogik
└── main.cpp                      # Hauptprogramm
```

### Voraussetzungen

- **C++ Compiler**: Unterstützung für C++11 oder höher
- **OpenGL**: Version 3.3 oder höher
- **GLFW**: 3.3 oder höher
- **GLEW**: 2.1 oder höher
- **GLM**: Mathe-Bibliothek für Vektoren und Matrizen
- **CMake**: Für die Erstellung des Projekts

### Installation

1. **Abhängigkeiten installieren**:
   - Stelle sicher, dass GLEW, GLFW und GLM installiert sind.
   - Auf Ubuntu: `sudo apt-get install libglew-dev libglfw3-dev libglm-dev`

2. **Projekt klonen und erstellen**:
   ```bash
   git clone <repository-url>
   cd Mond3D
   mkdir build
   cd build
   cmake ..
   make
   ```

3. **Ausführung**:
   ```bash
   ./Mond3D
   ```

### Verwendung

Das Programm rendert eine 3D-Darstellung des Mondes in einem OpenGL-Fenster. Über die Pfeiltasten kannst du den Mond drehen, zoomen und seine Ansicht anpassen.

### Funktionen

- **3D-Rotation**: Der Mond kann mithilfe der Maus oder der Tastatur um die eigene Achse rotiert werden.
- **Texturen und Beleuchtung**: Texturen und Beleuchtung verbessern das Aussehen des Mondes.
- **Einstellbare Kamera**: Die Kamera lässt sich in verschiedenen Winkeln und Abständen zum Objekt positionieren.
- **Transformationen**: Der Mond kann auf der X- und Y-Achse gedreht und geneigt werden.

### Steuerung

| Taste           | Funktion                                  |
|-----------------|------------------------------------------|
| W, S            | Kamera-Zoom                              |
| Pfeiltasten     | Rotation des Mondes                      |
| Z, X            | Neigung des Mondes                       |
| R               | Automatische Rotation ein/aus            |
| ESC             | Beendet das Programm                     |

### Screenshots

![3D-Darstellung des Mondes](./resources/screenshots/3d-mond.png)

### Fehlerbehebung

- **Problem beim Starten**: Stelle sicher, dass OpenGL 3.3+ auf deinem System unterstützt wird. Einige ältere GPUs sind nicht kompatibel.
- **Shader-Fehler**: Überprüfe, ob die Shader-Dateien (SimpleVertexShader.vertexshader, SimpleFragmentShader.fragmentshader) im `resources/`-Ordner verfügbar sind und korrekt geladen werden.
- **Kompilierungsfehler**: Prüfe, ob alle Bibliotheken korrekt installiert sind und die `CMakeLists.txt` angepasst ist.

### Credits

- **GLFW** und **GLEW** für Fensterverwaltung und OpenGL-Loader
- **GLM** für die Mathe-Bibliothek
- **OpenGL Tutorials**: [opengl-tutorial.org](https://www.opengl-tutorial.org/)

### Lizenz

Das Projekt ist Open-Source und kann ohne Lizenzierung verwendet und angepasst werden.
