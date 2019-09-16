
public class Main {

    public static void main(String[] args) {
        WallPaper rollsOfWallpaper = new WallPaper();

        double lengthOfRoomInMeters = 4;
        double widthOfRoomInMeters = 3;
        double heightOfRoomInMeters = 3;
        double widthOfWallpaperInMeters = 1;
        double lengthOfWallpaperInMeters = 10;

        System.out.println(rollsOfWallpaper.calculate(lengthOfRoomInMeters, widthOfRoomInMeters, heightOfRoomInMeters, widthOfWallpaperInMeters, lengthOfWallpaperInMeters));
    }
}
