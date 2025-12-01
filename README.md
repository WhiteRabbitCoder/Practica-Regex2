# 📝 Practica-Regex2

Aplicación de escritorio en Java que implementa un **formulario de registro de usuarios** con interfaz gráfica utilizando Java Swing.  Este proyecto está diseñado como práctica educativa para el desarrollo de formularios y validación de datos con expresiones regulares. 

## 📋 Descripción

Este proyecto consiste en un formulario de registro completo que permite a los usuarios ingresar información personal.  Está desarrollado con Java Swing y sigue una arquitectura sencilla orientada a la práctica de conceptos de programación en Java. 

## ✨ Características

- 🖥️ Interfaz gráfica intuitiva con Java Swing
- 📝 Formulario completo de registro de usuarios
- 🔐 Campos de contraseña con confirmación
- 📧 Campos de correo electrónico con confirmación
- 🌎 Selección de ciudades colombianas
- 📄 Soporte para diferentes tipos de identificación
- ✅ Checkbox para aceptación de términos y condiciones

## 🗂️ Estructura del Proyecto

```
Practica-Regex2/
├── src/
│   ├── module-info.java          # Configuración del módulo Java
│   └── vista/
│       ├── Inicio.java           # Clase principal (punto de entrada)
│       └── Formulario.java       # Panel con los componentes del formulario
└── README.md
```

## 📝 Campos del Formulario

| Campo | Descripción |
|-------|-------------|
| Nombres | Campo de texto para el nombre del usuario |
| Apellidos | Campo de texto para los apellidos |
| Tipo de Identificación | Selector con opciones: Cédula de Ciudadanía, Cédula de Extranjería, Pasaporte |
| Número de Documento | Campo de texto para el número de identificación |
| Lugar donde Vives | Selector con ciudades colombianas |
| Número de Teléfono | Campo de texto para el teléfono |
| Nacionalidad | Selector: Colombiana u Otro |
| Correo | Campo de texto para el email |
| Confirmar Correo | Campo para confirmar el email |
| Contraseña | Campo de contraseña |
| Confirmar Contraseña | Campo para confirmar la contraseña |
| Términos y Condiciones | Checkbox de aceptación |

## 🛠️ Requisitos Previos

- **Java JDK 11** o superior
- **IDE** compatible con Java (Eclipse, IntelliJ IDEA, NetBeans, VS Code)

## 🚀 Instalación y Ejecución

### Opción 1: Clonar el repositorio

```bash
# Clonar el repositorio
git clone https://github.com/WhiteRabbitCoder/Practica-Regex2.git

# Navegar al directorio del proyecto
cd Practica-Regex2
```

### Opción 2: Ejecutar desde un IDE

1. Abre tu IDE favorito (Eclipse, IntelliJ IDEA, NetBeans)
2. Importa el proyecto como un proyecto Java existente
3.  Navega hasta `src/vista/Inicio.java`
4. Ejecuta la clase `Inicio` como aplicación Java

### Opción 3: Compilar y ejecutar desde terminal

```bash
# Compilar el proyecto
javac -d bin src/module-info.java src/vista/*. java

# Ejecutar la aplicación
java --module-path bin -m regex/vista. Inicio
```

## 📸 Vista Previa

La aplicación muestra un formulario de registro con los siguientes elementos:
- Título: "Formulario de Registro"
- Campos de entrada para datos personales
- Selectores desplegables para opciones predefinidas
- Campos de contraseña ocultos
- Botón "Aceptar" para enviar el formulario

## 🔧 Tecnologías Utilizadas

- **Java** - Lenguaje de programación principal
- **Java Swing** - Framework para la interfaz gráfica
  - `JFrame` - Ventana principal
  - `JPanel` - Contenedor del formulario
  - `JTextField` - Campos de texto
  - `JPasswordField` - Campos de contraseña
  - `JComboBox` - Selectores desplegables
  - `JCheckBox` - Casilla de verificación
  - `JButton` - Botón de acción
  - `JLabel` - Etiquetas de texto

## 📚 Propósito Educativo

Este proyecto fue creado como práctica para:
- 📖 Aprender a construir interfaces gráficas con Java Swing
- 🔍 Implementar validaciones con expresiones regulares (Regex)
- 🏗️ Estructurar proyectos Java de manera organizada
- 💡 Comprender el manejo de eventos y componentes GUI

## 🤝 Contribuciones

Las contribuciones son bienvenidas.  Si deseas mejorar este proyecto:

1. Haz un Fork del repositorio
2. Crea una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Realiza tus cambios y haz commit (`git commit -m 'Agregar nueva funcionalidad'`)
4.  Sube los cambios a tu rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto es de código abierto y está disponible para fines educativos. 

## 👤 Autor

**WhiteRabbitCoder**

- GitHub: [@WhiteRabbitCoder](https://github.com/WhiteRabbitCoder)

---

⭐ Si este proyecto te fue útil, considera darle una estrella en GitHub. 
