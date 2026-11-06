public class monte_carlo {
    public static void main(String[] args) {
        int radius = 50;
        int edge = 100;

        double pi = Math.PI;

        double centerX = 50;
        double centerY = 50;

        double intCircle = 0;

        double areaSqr = edge * edge;
        double areaCrc = pi * radius * radius;

        int totalSim = 10_000_000;
        for(int i=0; i<totalSim; i++){
            double rndX = Math.random()*100;
            double rndY = Math.random()*100;

            double distanceY = Math.abs(rndY - centerY);
            double distanceX = Math.abs(rndX - centerX); 
            double distanceSquared=(distanceX * distanceX) + (distanceY * distanceY);
            // print(f"X:{rndX}, Y:{rndY} ---> {distance}")
            if (distanceSquared <= 2500)//50*50
                intCircle++;
        }
        System.out.println("*".repeat(35));
        System.out.println("Deneme sayısı: " + totalSim);
        System.out.println("Simülasyon -> Daire/Kare: " + ((double) intCircle / totalSim));
        System.out.println("Gerçek -> Daire/Kare: " + (areaCrc / areaSqr));
        System.out.println("Yaklaşık bulduğumuz pi sayısı: " + (((double) intCircle / totalSim) * 4));
        // Daire/Kare -> pi*r^2/4r^2 = pi/4
    }
}
