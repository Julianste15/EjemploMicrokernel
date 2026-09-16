# Ejemplo Microkernel 📦

> Ejemplo de la arquitectura **microkernel** aplicada a un sistema de envíos, con soporte de países agregable mediante plugins.

**🇪🇸 Español:** El núcleo (`core`) define el contrato de entrega y el gestor de plugins; cada país (Colombia, México, Chile) es un plugin independiente que se registra y se puede añadir o quitar sin tocar el núcleo. Ideal para entender el patrón *kernel + plugins* típico de la industria.

**🇺🇸 English:** A microkernel architecture sample for a shipping system. The core defines the delivery contract and a plugin manager; each country (Colombia, Mexico, Chile) is a standalone plugin that can be added or removed without modifying the core—the classic kernel + plugins pattern.

## ✨ Funcionalidades / Features

- Núcleo con `DeliveryPluginManager` y servicios de productos/envíos
- 3 plugins de países (Colombia, México, Chile) vía interfaz `IDeliveryPlugin`
- Arquitectura modular Maven (`core`, `common`, `*-plugin`)

## 🛠️ Tecnologías / Tech Stack

- Java · Maven · Arquitectura microkernel

## 🚀 Ejecución / Getting Started

```bash
mvn clean install
# Ejecutar desde el módulo core (clase Application)
```

## 👤 Autor y contexto / About

Proyecto académico de la asignatura **Arquitecturas de Software** (Universidad del Cauca). © Julián Camacho.