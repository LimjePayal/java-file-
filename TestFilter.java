interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to image");
    }

    public void reset_filter() {
        System.out.println("Resetting image filters");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to data");
    }

    public void reset_filter() {
        System.out.println("Resetting data filters");
    }
}

class TestFilter {
    public static void main(String[] args) {
        Filterable f1 = new ImageProcessor();
        Filterable f2 = new DataAnalyzer();

        f1.apply_filter("Blur");
        f1.reset_filter();

        f2.apply_filter("Noise Reduction");
        f2.reset_filter();
    }
}