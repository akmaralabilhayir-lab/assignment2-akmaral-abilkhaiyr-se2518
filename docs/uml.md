```plantuml
@startuml
abstract class Vehicle {
  brand : String
  year : int
  driver : Driver
  startEngine()
  stopEngine()
  displayInfo()
}

class Car {
  doors : int
  fuelType : String
}

class Motorcycle {
  hasSidecar : boolean
}

class Truck {
  capacity : double
  numAxles : int
}

class Driver {
  name : String
  licenseNumber : String
  displayDriverInfo()
}

Vehicle <|-- Car
Vehicle <|-- Motorcycle
Vehicle <|-- Truck
Vehicle o-- Driver
@enduml
