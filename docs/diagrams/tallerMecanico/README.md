# Taller mecánico

## Descripción Aplicación
En un taller mecánico se detectan los problemas que tiene un vehículo con la ayuda del personal receptor del vehículo. Dicho personal, elabora un reporte donde anota los problemas detectados al vehículo. Seguidamente el mecánico hace los arreglos pertinentes en función de lo indicado en el reporte. El gerente del taller es el encargado de elaborar y entregar la factura al cliente, para luego proceder a cobrarle por el servicio prestado.
Todo este trabajo se lleva a mano, hacer el reporte no es más que registrar la información pertinente en hojas de papel, información tal como: marca, modelo, placa, número de serie del motor y cantidad de puestos, los problemas que presenta el vehículo, daños evidentes en el vehículo que sucedieron antes de entrar en el taller y los datos del cliente para realizar la facturación.
Luego, en el mismo papel, los mecánicos, apuntan las reparaciones que van realizando, que repuestos usaron, cuándo se empezó a realizar el trabajo y el tiempo que tomó terminar. Esta última información es importante, dado que, a finales de semana, el jefe del taller revisa una a una todas las hojas y va sumando las horas de todos los mecánicos manualmente, para poder entregar un bono por rendimiento a los mecánicos. Por último, también se lleva en papel la información del personal que trabaja en dicho taller, información como: nombre, apellido, documento de identidad y cargo que ocupa.

## Metodología
La aplicación esta requisitada y diseñada usando la metodología UP. Al ser una metodología dirigida por casos de uso, se podrá realizar una traza desde los requisitos, hasta el código implementado. Esta trazabilidad permite verificar la transformación de los requisitos en elementos de modelo sucesores, resultantes del análisis y diseño, implementación, pruebas y despliegue.

| <img src="../../img/trazabilidadCasosUsoDisciplinas.png" width=80% style="background-color:white;"><br><sub>Trazabilidad de Requisitos por disciplinas</sub> |
| :---: |

## Modelo de Dominio
### Diagrama de clases
| <img src="scenariosView/domainModel/ModeloDominioTallerMecanico.png" width=80% style="background-color:white;"> |
| :---: |

### Diagrama de contexto
| <img src="scenariosView/domainModel/ModeloDominioDiagramaContexto.png" width=80% style="background-color:white;"> |
| :---: |


## Modelo de Casos de uso
### Diagrama de casos de uso
| <img src="scenariosView/useCaseModel/simplificado/CasosUso.png" width=50% style="background-color:white;"> |
| :---: |


### Especificaciones de casos de uso
La descripción de cada caso de uso lo podrá ver en: [especificaciones de los casos de uso](scenariosView/useCaseModel/simplificado/especificacionCasosUso.pdf)

### Diagrama de contexto
| <img src="scenariosView/useCaseModel/simplificado/DiagramaContexto.png" width=100% style="background-color:white;"> |
| :---: |

### Prototipo de interfaz
Los prototipos de las pantallas las podrá ver en: [prototipo de pantallas](scenariosView/useCaseModel/simplificado/prototipo/prototype.md)

<!--
### Trazabilidad entre pantallas y casos de uso
| <img src="scenariosView/useCaseModel/prototypeUseCaseTrace/prototypeTrace.svg" width=80% style="background-color:white;"> |
| :---: |
-->

## Modelo de Análisis
### Realización de análisis de casos de uso

#### Diagrama de clases de análisis de UC1 – Elaborar reporte
![Diagrama de clases de análisis de UC1](logicalView/analisysView/usecaseAnalisys/analysisClassDiagramUC1/analysisClassDiagramUC1.svg)

#### Diagrama de colaboración de análisis de UC1 – Elaborar reporte
![Diagrama de colaboración de análisis de UC1](logicalView/analisysView/usecaseAnalisys/analysisComunicationDiagramUC1/analysisComunicationDiagramUC1.svg)

#### Diagrama de clases de análisis de UC2 – Apuntar Reparaciones
![Diagrama de clases de análisis de UC2](logicalView/analisysView/usecaseAnalisys/analysisClassDiagramUC2/analysisClassDiagramUC2.svg)

#### Diagrama de colaboración de análisis de UC2 – Apuntar Reparaciones
![Diagrama de colaboración de análisis de UC2](logicalView/analisysView/usecaseAnalisys/analysisComunicationDiagramUC2/analysisComunicationDiagramUC2.svg)

### Diagrama de clases de análisis

### Arquitectura de análisis

