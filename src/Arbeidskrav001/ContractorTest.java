/*
    * Here is the main method of this answer.
 */

package Arbeidskrav001;
import java.time.LocalDate;

public class ContractorTest {
    public static void main(String[] args) {
        Address customer1 = new Address("Hovedveien 3", "0542", "Oslo", "Norge");
        Address customer2 = new Address("Delta 7", "0575", "Oslo", "Norge");

        LocalDate start1 = LocalDate.parse("2019-04-18");
        LocalDate end1 = LocalDate.parse("2021-04-18");
        Project p1 = new Project("Snøhetta office", "Snøhetta",
                customer1, start1, end1, .22);
        LocalDate start2  = LocalDate.parse("2019-09-19");
        LocalDate end2 = LocalDate.parse("2019-12-24");
        Project p2 = new Project("Garage", "Ole Jørgen Bakken",
                customer2, start2, end2, .15);

        Address electricianAddress = new Address("Ekornveien 11", "Øyafestivalen", "2110", "Oslo", "Norge");
        Address carpenterAddress = new Address("Ingensteds 69", "420", "Oslo", "Norge");
        Address plumberAddress = new Address("Himmelen 12", "69", "Himmel", "Himmelen");

        Electrician e = new Electrician("Peg", "Fisher", electricianAddress,
                101, 25, 320);
        Carpenter c = new Carpenter("Yusef", "Eberly", carpenterAddress,
                202, 53.5, 290);
        Plumber p = new Plumber("Harley", "Davidson", plumberAddress,
                301, 20.75, 270);

        p1.workers.add(c);
        p1.workers.add(e);
        p1.workers.add(p);
        c.setLumberCosts(400000);
        e.setWiringCosts(60000);
        p.setPlumbingCosts(50000);

        p2.workers.add(e);
        p2.workers.add(c);
        e.setWiringCosts(6000);
        c.setLumberCosts(4000);

        System.out.println("The project \"" + p1.projectName + "\" is scheduled to start on the " + p1.startDate + ", and end on the " + p1.endDate + ". \n");

        System.out.println("************************************************" + "\n");

        System.out.println(c.work() + " done by: \"" + c.firstName + " " + c.lastName + ".");
        System.out.println("Address info: "+ c.address + "\n");

        System.out.println(e.work() + " done by: \"" + e.firstName + " " + e.lastName + ".");
        System.out.println("Address info: "+ e.address + "\n");

        System.out.println(p.work() + " done by: \"" + p.firstName + " " + p.lastName + ".");
        System.out.println("Address info: "+ p.address + "\n");

        System.out.println("************************************************" + "\n");

        System.out.println("The cost breakdown is calculated to look like this: \n");
        System.out.print(c.toString());
        System.out.print(e.toString());
        System.out.println(p.toString());
        System.out.println("Which comes to a total of:");
        System.out.print(((e).calculatePay() + (p).calculatePay() + (c).calculatePay()) * p1.overheadPercent + "kr with an "
                + p1.overheadPercent + " overhead percent" + "\n");
        System.out.println("\n" + "*************************************" + "\n");

        System.out.println("The project \"" + p2.projectName + "\" is scheduled to start on the " + p2.startDate + ", and end on the " + p2.endDate + ". \n");

        System.out.println("************************************************" + "\n");

        System.out.println(c.work() + " done by: \"" + c.firstName + " " + c.lastName + ".");
        System.out.println("Address info: "+ c.address + "\n");

        System.out.println(e.work() + " done by: \"" + e.firstName + " " + e.lastName + ".");
        System.out.println("Address info: "+ e.address + "\n");

        System.out.println("************************************************" + "\n");

        System.out.println("The cost breakdown is calculated to look like this: \n");
        System.out.print(c.toString());
        System.out.print(e.toString() + "\n");
        System.out.println("Which comes to a total of:");
        System.out.print(((e).calculatePay() + (c).calculatePay()) * p2.overheadPercent + "kr with an "
                + p2.overheadPercent + " overhead percent" + "\n");
    }

}
