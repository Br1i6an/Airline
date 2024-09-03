/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.logic;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Airline {

    //FLIGHTS//
    private NationalFlight nationalFlight;
    private InternationalFlight internationalFlight;
    private MixedFlight mixedFlight;
    private HumanitarianFlight humanitarianFlight;
    private CargoFlight cargoFlight;
    private PassengersFlight passengersFlight;
    //WORKERS//
    private StewardessFood stewardessFood;
    private StewardessSecurity stewardessSecurity;
    private StewardessCustomerSupport stewardessCustomerSupport;

    //LISTS//
    private List<Pilot> pilots;
    private List<Stewardess> stewardesses;
    private List<Flight> flights;
    private List<Route> routes;

    public Airline() {
        flights = new ArrayList<Flight>();
        stewardesses = new ArrayList<Stewardess>();
        pilots = new ArrayList<Pilot>();
        routes = new ArrayList<Route>();
        for (Flight flight1 : flights) {
            flights = (List<Flight>) new Flight();
        }
        for (Stewardess stewardess1 : stewardesses) {
            stewardesses = (List<Stewardess>) new Stewardess();

        }
        for (Pilot pilot1 : pilots) {
            pilots = (List<Pilot>) new Pilot();

        }
        for (Route route1 : routes) {
            routes = (List<Route>) new Route();

        }

        routesList();
        nationalFlightsList();
        internationalFlightsList();
        cargoFlightsList();
        humanitarianFlightsList();
        passengersFlightsList();
        mixedFlightsList();
        pilotsList();
        stewardessesListcustomerSupport();

    }

    public Airline(NationalFlight nationalFlight, InternationalFlight internationalFlight, MixedFlight mixedFlight, HumanitarianFlight humanitarianFlight, CargoFlight cargoFlight, PassengersFlight passengersFlight, StewardessFood stewardessFood, StewardessSecurity stewardessSecurity, StewardessCustomerSupport stewardessCustomerSupport, List<Pilot> pilots, List<Stewardess> stewardesses, List<Flight> flights, List<Route> routes) {
        this.nationalFlight = nationalFlight;
        this.internationalFlight = internationalFlight;
        this.mixedFlight = mixedFlight;
        this.humanitarianFlight = humanitarianFlight;
        this.cargoFlight = cargoFlight;
        this.passengersFlight = passengersFlight;
        this.stewardessFood = stewardessFood;
        this.stewardessSecurity = stewardessSecurity;
        this.stewardessCustomerSupport = stewardessCustomerSupport;
        this.pilots = pilots;
        this.stewardesses = stewardesses;
        this.flights = flights;
        this.routes = routes;
    }

    public NationalFlight getNationalFlight() {
        return nationalFlight;
    }

    public void setNationalFlight(NationalFlight nationalFlight) {
        this.nationalFlight = nationalFlight;
    }

    public InternationalFlight getInternationalFlight() {
        return internationalFlight;
    }

    public void setInternationalFlight(InternationalFlight internationalFlight) {
        this.internationalFlight = internationalFlight;
    }

    public MixedFlight getMixedFlight() {
        return mixedFlight;
    }

    public void setMixedFlight(MixedFlight mixedFlight) {
        this.mixedFlight = mixedFlight;
    }

    public HumanitarianFlight getHumanitarianFlight() {
        return humanitarianFlight;
    }

    public void setHumanitarianFlight(HumanitarianFlight humanitarianFlight) {
        this.humanitarianFlight = humanitarianFlight;
    }

    public CargoFlight getCargoFlight() {
        return cargoFlight;
    }

    public void setCargoFlight(CargoFlight cargoFlight) {
        this.cargoFlight = cargoFlight;
    }

    public PassengersFlight getPassengersFlight() {
        return passengersFlight;
    }

    public void setPassengersFlight(PassengersFlight passengersFlight) {
        this.passengersFlight = passengersFlight;
    }

    public StewardessFood getStewardessFood() {
        return stewardessFood;
    }

    public void setStewardessFood(StewardessFood stewardessFood) {
        this.stewardessFood = stewardessFood;
    }

    public StewardessSecurity getStewardessSecurity() {
        return stewardessSecurity;
    }

    public void setStewardessSecurity(StewardessSecurity stewardessSecurity) {
        this.stewardessSecurity = stewardessSecurity;
    }

    public StewardessCustomerSupport getStewardessCustomerSupport() {
        return stewardessCustomerSupport;
    }

    public void setStewardessCustomerSupport(StewardessCustomerSupport stewardessCustomerSupport) {
        this.stewardessCustomerSupport = stewardessCustomerSupport;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }

    public List<Stewardess> getStewardesses() {
        return stewardesses;
    }

    public void setStewardesses(List<Stewardess> stewardesses) {
        this.stewardesses = stewardesses;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    //LISTS//
    //ROUTES //
    public void routesList() {
        routes.add(new Route("Bogota ", " Medellin", 12345, "5 hours"));
        routes.add(new Route("Cali ", " Manizales", 12347, "4 hours"));
        routes.add(new Route("Tunja ", " Bucaramanga", 27276, "6 hours"));
        routes.add(new Route("Pereira ", " Medellin", 25871, "3 hours"));
        routes.add(new Route("Medellin ", " Barranquilla", 98769, "5 hours"));
        routes.add(new Route("Tunja ", " Manizales", 83754, "5 hours"));
        routes.add(new Route("Barranquilla ", " Girardot", 87578, "6 hours"));
        routes.add(new Route("Bogota ", " Cali", 74461, "3 hours"));
        routes.add(new Route("Cali ", " Medellin", 75835, "2 hours"));
        routes.add(new Route("Pereira ", " Bogota", 87608, "4 hours"));
        routes.add(new Route("Dubai ", " Moscow", 74512, "4 hours"));
        routes.add(new Route("Sevilla ", " New York", 91537, "3 hours"));
        routes.add(new Route("Madrid ", " Barcelona", 83760, "2 hours"));
        routes.add(new Route("London ", " Cardiff", 87621, "4 hours"));
        routes.add(new Route("Manchester ", " Chelsea", 98662, "4 hours"));
        routes.add(new Route("Colombia ", " Venezuela", 14321, "2 hours"));
        routes.add(new Route("Italy ", " Colombia", 53431, "5 hours"));
        routes.add(new Route("France ", " Colombia", 14235, "6 hours"));
        routes.add(new Route("Argentina ", " Brazil", 46532, "5 hours"));
        routes.add(new Route("Colombia ", " U.S.A", 13254, "5 hours"));
        routes.add(new Route("Colombia ", " France", 10821, "5 hours"));

    }

    //WORKERS //
    public void pilotsList() {
        pilots.add(new Pilot(routes.get(1), "Juan", "Perez", 30, 1234534897, 4000000));
        pilots.add(new Pilot(routes.get(2), "Carlos", "Vega", 40, 1659764863, 3000000));
        pilots.add(new Pilot(routes.get(3), "Pedro", "Ramirez", 38, 1593075621, 4000000));
        pilots.add(new Pilot(routes.get(4), "Tyrone", "Jaimes", 26, 1076598763, 4000000));
        pilots.add(new Pilot(routes.get(5), "Giovanni", "Gomez", 38, 1642984385, 3000000));
        pilots.add(new Pilot(routes.get(6), "Cesar", "Alonso", 46, 1293075976, 3000000));
        pilots.add(new Pilot(routes.get(7), "Carl", "Johnson", 32, 1234567890, 3000000));
        pilots.add(new Pilot(routes.get(8), "Steve", "Aarons", 29, 1987654321, 4000000));
        pilots.add(new Pilot(routes.get(9), "Estensoro", "Chevalier", 34, 1342654098, 4000000));
        pilots.add(new Pilot(routes.get(10), "Jose", "Gutiérrez", 42, 1098326458, 3000000));

    }

    public void stewardessesListcustomerSupport() {
        stewardesses.add(new StewardessCustomerSupport("7:00 ", "Complaints ", "Morning ", "Assistant ", "Laura ", "Suarez ", 25, 1759685473, 1500000));
        stewardesses.add(new StewardessCustomerSupport("14:00 ", "Suggestions ", "Evening ", "Administratrix ", "Sara ", "Ramirez ", 35, 1956439871, 2300000));
        stewardesses.add(new StewardessCustomerSupport("20:00 ", "Complaints ", "Night", "Assistant ", "Maria", "Gutierrez", 24, 1843685732, 1500000));

    }

    public void stewardessesListFood() {
        stewardesses.add(new StewardessFood("Breakfast ", "Chocolate and Scrambled eggs ", "9:00 ", "Morning ", "Waitress", "Amalia ", "Canizares ", 24, 1856409863, 1500000));
        stewardesses.add(new StewardessFood("Breakfast ", "Coffee and Toasts", "8:00 ", "Morning ", "Waitress", "Coral ", "Romero ", 26, 1956463082, 1500000));
        stewardesses.add(new StewardessFood("Breakfast ", "Orange Juice and Pancakes ", "8:00 ", "Morning ", "Waitress ", "Rosa ", "Rosales ", 24, 1856409863, 1500000));
    }

    public void stewardessListSecurity() {
        stewardesses.add(new StewardessSecurity("Open-Close the door ", "12:00 ", "13:00 ", "Day-Evening ", "Guard ", "Brayan ", "Perez ", 27, 1753098217, 1000000));
        stewardesses.add(new StewardessSecurity("Verify Passports ", "12:00 ", "13:00 ", "Day-Evening ", "Staff ", "Brandon ", "Gutierrez ", 23, 1956478213, 1000000));
        stewardesses.add(new StewardessSecurity("Check Luggage ", "12:00 ", "13:00 ", "Day-Evening ", "Guard ", "Kevin ", " ", 27, 1082138564, 1000000));

    }

    //FLIGHTS//
    public void nationalFlightsList() {
        flights.add(new NationalFlight(300, 874, "Day", 1000000, routes.get(1)));
        flights.add(new NationalFlight(230, 524, "Night", 850000, routes.get(2)));
        flights.add(new NationalFlight(310, 735, "Day", 900000, routes.get(3)));
        flights.add(new NationalFlight(280, 764, "Night", 820000, routes.get(4)));
        flights.add(new NationalFlight(300, 365, "Day", 1000000, routes.get(5)));

    }

    public void internationalFlightsList() {
        flights.add(new InternationalFlight(130, 143, "Day ", 2000000, routes.get(11)));
        flights.add(new InternationalFlight(320, 871, "Night ", 1100000, routes.get(12)));
        flights.add(new InternationalFlight(180, 432, "Day ", 1000000, routes.get(13)));
        flights.add(new InternationalFlight(380, 637, "Night ", 1200000, routes.get(14)));
        flights.add(new InternationalFlight(200, 198, "Day ", 1200000, routes.get(15)));

    }

    public void cargoFlightsList() {
        flights.add(new CargoFlight("Phones ", 401, "Day ", 80000000, routes.get(6)));
        flights.add(new CargoFlight("Bikes ", 967, "Night ", 60000000, routes.get(7)));
        flights.add(new CargoFlight("Computers ", 154, "Day ", 100000000, routes.get(8)));
        flights.add(new CargoFlight("Tv's ", 348, "Night ", 70000000, routes.get(9)));
        flights.add(new CargoFlight("Cars ", 841, "Day ", 400000000, routes.get(10)));

    }

    public void mixedFlightsList() {
        flights.add(new MixedFlight(10000, 500, 423, "Day ", 1100000, routes.get(1)));
        flights.add(new MixedFlight(9500, 300, 741, "Night ", 800000, routes.get(2)));
        flights.add(new MixedFlight(11000, 600, 987, "Day ", 1200000, routes.get(3)));
        flights.add(new MixedFlight(6000, 230, 126, "Night ", 700000, routes.get(4)));
        flights.add(new MixedFlight(12000, 620, 122, "Day ", 1000000, routes.get(5)));

    }

    public void humanitarianFlightsList() {
        flights.add(new HumanitarianFlight("Venezuelan ", 139, "Day ", 40000000, routes.get(16)));
        flights.add(new HumanitarianFlight("Colombian ", 872, "Night ", 90000000, routes.get(17)));
        flights.add(new HumanitarianFlight("Colombian ", 753, "Day ", 60000000, routes.get(18)));
        flights.add(new HumanitarianFlight("Brazilian ", 586, "Night ", 95000000, routes.get(19)));
        flights.add(new HumanitarianFlight("American ", 201, "Day ", 100000000, routes.get(20)));

    }

    public void passengersFlightsList() {
        flights.add(new PassengersFlight(350, 231, "Day ", 1500000, routes.get(11)));
        flights.add(new PassengersFlight(500, 845, "Night ", 2000000, routes.get(12)));
        flights.add(new PassengersFlight(400, 811, "Day ", 1800000, routes.get(13)));
        flights.add(new PassengersFlight(290, 609, "Night ", 1700000, routes.get(14)));
        flights.add(new PassengersFlight(123, 436, "Day ", 1500000, routes.get(15)));

    }

    //ADD WORKERS//
    public void addListWorkersPilot(Route routes, String name, String lastname, int age, int Id, int salary) {
        pilots.add(new Pilot(routes, name, lastname, age, Id, salary));

    }

    public void addListWorkersStewardessCustomer(String workShift, String workRole, String name, String lastname, int age, int Id, int salary) {
        stewardesses.add(new StewardessCustomerSupport(name, lastname, workShift, workRole, name, lastname, age, Id, salary));

    }

    //ADD FLIGHTS//
    public void addListFlightsNational(int personCapacity, int flighId, String schedule, int price, Route route) {
        flights.add(new NationalFlight(personCapacity, flighId, schedule, price, route));

    }

    public void addListFlightsInternational(int capacity, int flighId, String schedule, int price, Route route) {
        flights.add(new InternationalFlight(capacity, flighId, schedule, price, route));

    }

    public void addListFlightsCargo(String type, int flighId, String schedule, int capacity, int price, Route route) {
        flights.add(new CargoFlight(type, flighId, schedule, price, route));

    }

    public void addListFlightsMixed(int Personweight, int Cargoweight, int flighId, String schedule, int price, Route route) {
        flights.add(new MixedFlight(Personweight, Cargoweight, flighId, schedule, price, route));

    }

    public void addListFlightsHumanitarian(String nationality, int flightId, String schedule, int capacity, int price, Route route) {
        flights.add(new HumanitarianFlight(nationality, flightId, schedule, price, route));

    }

    public void addListFlightsPassengers(int numPassengers, int flightId, String schedule, int capacity, int price, Route route) {
        flights.add(new PassengersFlight(capacity, flightId, schedule, price, route));

    }

    //SHOW WORKERS//
    public String showPilots() {
        List<String> pilots1 = new ArrayList<String>();
        pilots1 = showPilots(pilots1);
        String text = "\n";
        for (String item : pilots1) {
            text = text + item;

        }
        return text;

    }

    public List<String> showPilots(List<String> pilotss) {
        for (int i = 0; i < pilots.size(); i++) {
            if (pilots.get(i).getClass().getSimpleName().equals("Pilot")) {
                pilotss.add("\n Name: " + getPilots().get(i).getName()
                        + "\n Last Name: " + getPilots().get(i).getLastName()
                        + "\n Id: " + getPilots().get(i).getId()
                        + "\n Age: " + getPilots().get(i).getAge()
                        + "\n Salary: " + getPilots().get(i).getSalary()
                        + "\n Route Origin: " + getRoutes().get(i).getOrigin()
                        + "\n Route Destination: " + getRoutes().get(i).getDestination()
                        + "\n Route Id: " + getRoutes().get(i).getRouteId()
                        + "\n Route Flight Duration: " + getRoutes().get(i).getFlightDuration());
            }

        }
        return pilotss;

    }

    public String showStewardesses() {
        List<String> stewardesses1 = new ArrayList<String>();
        stewardesses1 = showStewardesses(stewardesses1);
        String text = "\n";
        for (String item : stewardesses1) {
            text = text + item;

        }
        return text;

    }

    public List<String> showStewardesses(List<String> stewardessess) {
        for (int i = 0; i < stewardesses.size(); i++) {
            if (stewardesses.get(i).getClass().getSimpleName().equals("StewardessCustomSupport")) {
                stewardessess.add("------STEWARDESSES CUSTOMER SUPPORT------\n"
                        + "\n Hour: " + ((StewardessCustomerSupport) stewardesses.get(i)).getHour()
                        + "\n Attention Type: " + ((StewardessCustomerSupport) stewardesses.get(i)).getAttentionType()
                        + "\n Name: " + ((StewardessCustomerSupport) stewardesses.get(i)).getName()
                        + "\n Last Name: " + ((StewardessCustomerSupport) stewardesses.get(i)).getLastName()
                        + "\n Id: " + ((StewardessCustomerSupport) stewardesses.get(i)).getId()
                        + "\n Salary: " + ((StewardessCustomerSupport) stewardesses.get(i)).getSalary()
                        + "\n Age: " + ((StewardessCustomerSupport) stewardesses.get(i)).getAge()
                        + "\n Work Shift: " + ((StewardessCustomerSupport) stewardesses.get(i)).getWorkshift()
                        + "\n Work Role: " + ((StewardessCustomerSupport) stewardesses.get(i)).getWorkRole());

            } else if (stewardesses.get(i).getClass().getSimpleName().equals("StewardessFood")) {
                stewardessess.add("------STEWARDESSES FOOD------\n"
                        + "\n Food Type: " + ((StewardessFood) stewardesses.get(i)).getFoodType()
                        + "\n Dish: " + ((StewardessFood) stewardesses.get(i)).getDish()
                        + "\n Dish Hour: " + ((StewardessFood) stewardesses.get(i)).getDishHour()
                        + "\n Name: " + ((StewardessFood) stewardesses.get(i)).getName()
                        + "\n Last Name: " + ((StewardessFood) stewardesses.get(i)).getLastName()
                        + "\n Id: " + ((StewardessFood) stewardesses.get(i)).getId()
                        + "\n Salary: " + ((StewardessFood) stewardesses.get(i)).getSalary()
                        + "\n Age: " + ((StewardessFood) stewardesses.get(i)).getAge()
                        + "\n Work Shift: " + ((StewardessFood) stewardesses.get(i)).getWorkshift()
                        + "\n Work Role: " + ((StewardessFood) stewardesses.get(i)).getWorkRole());

            } else if (stewardesses.get(i).getClass().getSimpleName().equals("StewardessSecurity")) {
                stewardessess.add("------STEWARDESSES SECURITY------\n"
                        + "\n Instructions: " + ((StewardessSecurity) stewardesses.get(i)).getInstructions()
                        + "\n Door Open Hour: " + ((StewardessSecurity) stewardesses.get(i)).getDoorOperHour()
                        + "\n Door Close Hour: " + ((StewardessSecurity) stewardesses.get(i)).getDoorCloseHour()
                        + "\n Instructions: " + ((StewardessSecurity) stewardesses.get(i)).getInstructions()
                        + "\n Name: " + ((StewardessSecurity) stewardesses.get(i)).getName()
                        + "\n Last Name: " + ((StewardessSecurity) stewardesses.get(i)).getLastName()
                        + "\n Id: " + ((StewardessSecurity) stewardesses.get(i)).getId()
                        + "\n Salary: " + ((StewardessSecurity) stewardesses.get(i)).getSalary()
                        + "\n Age: " + ((StewardessSecurity) stewardesses.get(i)).getAge()
                        + "\n Work Shift: " + ((StewardessSecurity) stewardesses.get(i)).getWorkshift()
                        + "\n Work Role: " + ((StewardessSecurity) stewardesses.get(i)).getWorkRole());

            }

        }
        return stewardessess;

    }

    //SHOW FLIGHTS//
    public String showFlights() {
        List<String> flights1 = new ArrayList<String>();
        flights1 = showFlights(flights1);
        String text = "\n";
        for (String item : flights1) {
            text = text + item;

        }
        return text;
    }

    public List<String> showFlights(List<String> flightss) {
        int flt = 0;
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getClass().getSimpleName().equals("NationalFlight")) {
                flightss.add("------NATIONAL FLIGHT------\n"
                        + "\n Person Capacity : " + ((NationalFlight) flights.get(i)).getPersonCapacity()
                        + "\n Flight Id: " + ((NationalFlight) flights.get(i)).getFlightId()
                        + "\n Schedule: " + ((NationalFlight) flights.get(i)).getSchedule()
                        + "\n Price: " + ((NationalFlight) flights.get(i)).getPrice()
                        + "\n Route Flight Duration: " + getRoutes().get(flt).getFlightDuration()
                        + "\n Route Origin: " + ((NationalFlight) flights.get(i)).getRoute().getOrigin()
                        + "\n Route Destination: " + getRoutes().get(flt).getDestination()
                        + "\n Route Id: " + getRoutes().get(flt).getRouteId());

            } else if (flights.get(i).getClass().getSimpleName().equals("InternationalFlight")) {
                flightss.add("------INTERNATIONAL FLIGHT------\n"
                        + "\n Capacity: " + ((InternationalFlight) flights.get(i)).getCapacity()
                        + "\n Flight Id: " + ((InternationalFlight) flights.get(i)).getFlightId()
                        + "\n Schedule: " + ((InternationalFlight) flights.get(i)).getSchedule()
                        + "\n Price: " + ((InternationalFlight) flights.get(i)).getPrice()
                        + "\n Route Flight Duration: " + getRoutes().get(flt).getFlightDuration()
                        + "\n Route Origin: " + ((InternationalFlight) flights.get(i)).getRoute().getOrigin()
                        + "\n Route Destination: " + getRoutes().get(flt).getDestination()
                        + "\n Route Id: " + getRoutes().get(flt).getRouteId());

            } else if (flights.get(i).getClass().getSimpleName().equals("CargoFlight")) {
                flightss.add("------CARGO FLIGHT------\n"
                        + "\n Cargo Type: " + ((CargoFlight) flights.get(i)).getType()
                        + "\n Flight Id: " + ((CargoFlight) flights.get(i)).getFlightId()
                        + "\n Schedule: " + ((CargoFlight) flights.get(i)).getSchedule()
                        + "\n Price: " + ((CargoFlight) flights.get(i)).getPrice()
                        + "\n Route Flight Duration: " + getRoutes().get(i).getFlightDuration()
                        + "\n Route Origin: " + ((CargoFlight) flights.get(i)).getRoute().getOrigin()
                        + "\n Route Destination: " + getRoutes().get(flt).getDestination()
                        + "\n Route Id: " + getRoutes().get(flt).getRouteId());

            } else if (flights.get(i).getClass().getSimpleName().equals("MixedFlight")) {
                flightss.add("------MIXED FLIGHT------\n"
                        + "\n Person Weight: " + ((MixedFlight) flights.get(i)).getPersonweight()
                        + "\n Cargo Weight: " + ((MixedFlight) flights.get(i)).getCargoweight()
                        + "\n Flight Id: " + ((MixedFlight) flights.get(i)).getFlightId()
                        + "\n Schedule: " + ((MixedFlight) flights.get(i)).getSchedule()
                        + "\n Price: " + ((MixedFlight) flights.get(i)).getPrice()
                        + "\n Route Flight Duration: " + getRoutes().get(flt).getFlightDuration()
                        + "\n Route Origin: " + ((MixedFlight) flights.get(i)).getRoute().getOrigin()
                        + "\n Route Destination: " + getRoutes().get(flt).getDestination()
                        + "\n Route Id: " + getRoutes().get(flt).getRouteId());

            } else if (flights.get(i).getClass().getSimpleName().equals("HumanitarianFlight")) {
                flightss.add("------HUMANITARIAN FLIGHT------\n"
                        + "\n Nationality: " + ((HumanitarianFlight) flights.get(i)).getNationality()
                        + "\n Flight Id: " + ((HumanitarianFlight) flights.get(i)).getFlightId()
                        + "\n Schedule: " + ((HumanitarianFlight) flights.get(i)).getSchedule()
                        + "\n Price: " + ((HumanitarianFlight) flights.get(i)).getPrice()
                        + "\n Route Flight Duration: " + getRoutes().get(flt).getFlightDuration()
                        + "\n Route Origin: " + ((HumanitarianFlight) flights.get(i)).getRoute().getOrigin()
                        + "\n Route Destination: " + getRoutes().get(flt).getDestination()
                        + "\n Route Id: " + getRoutes().get(flt).getRouteId());

            } else if (flights.get(i).getClass().getSimpleName().equals("PassengersFlight")) {
                flightss.add("------PASSENGERS FLIGHT------\n"
                        + "\n Passengers Capacity: " + ((PassengersFlight) flights.get(i)).getPassengersCapacity()
                        + "\n Flight Id: " + ((PassengersFlight) flights.get(i)).getFlightId()
                        + "\n Schedule: " + ((PassengersFlight) flights.get(i)).getSchedule()
                        + "\n Price: " + ((PassengersFlight) flights.get(i)).getPrice()
                        + "\n Route Flight Duration: " + getRoutes().get(flt).getFlightDuration()
                        + "\n Route Origin: " + ((PassengersFlight) flights.get(i)).getRoute().getOrigin()
                        + "\n Route Destination: " + getRoutes().get(flt).getDestination()
                        + "\n Route Id: " + getRoutes().get(flt).getRouteId());

            }
            flt++;
            if (flt >= getRoutes().size()) {
                flt = 0;
            }

        }
        return flightss;
    }

    //SHOW ROUTES//
    public String showRoutes() {
        List<String> routes1 = new ArrayList<String>();
        routes1 = showRoutes(routes1);
        String text = "\n";
        for (String item : routes1) {
            text = text + item;

        }
        return text;
    }

    public List<String> showRoutes(List<String> routess) {
        for (int i = 0; i < routes.size(); i++) {
            if (routes.get(i).getClass().getSimpleName().equals("Route")) {
                routess.add("------ROUTES------\n"
                        + "\n Route Id: " + ((Route) routes.get(i)).getRouteId()
                        + "\n Origin: " + ((Route) routes.get(i)).getOrigin()
                        + "\n Destination: " + ((Route) routes.get(i)).getDestination()
                        + "\n Flight Duration: " + ((Route) routes.get(i)).getFlightDuration());

            }
        }

        return routess;
    }

}
