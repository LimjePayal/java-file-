class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    void GetRent() {
        if (CarType.equalsIgnoreCase("Small"))
            Rent = 1000;
        else if (CarType.equalsIgnoreCase("Van"))
            Rent = 800;
        else if (CarType.equalsIgnoreCase("SUV"))
            Rent = 2500;
    }

    void ShowCar() {
        System.out.println(CarId + " " + CarType + " " + Rent);
    }
}