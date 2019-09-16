public class WallPaper {

    public double calculate(double lengthOfRoomInMeters, double widthOfRoomInMeters, double heightOfRoomInMeters, double widthOfWallpaperInMeters, double lengthOfWallpaperInMeters) {
        double perimeterOfRoomInMeters = (lengthOfRoomInMeters + widthOfRoomInMeters) * 2;
        double quantityOfWallpaperPanels = Math.ceil(perimeterOfRoomInMeters / widthOfWallpaperInMeters);
        double quantityOfPanelsPerWallpaperRoll = lengthOfWallpaperInMeters / heightOfRoomInMeters;
        return Math.ceil(quantityOfWallpaperPanels / quantityOfPanelsPerWallpaperRoll);
    }
}
