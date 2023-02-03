package areas;

public class DinningRoom {
    private int windows, width, height, chairCapacity;
    private boolean tv;
    private String color;

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getChairCapacity() {
        return chairCapacity;
    }

    public void setChairCapacity(int chairCapacity) {
        this.chairCapacity = chairCapacity;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}