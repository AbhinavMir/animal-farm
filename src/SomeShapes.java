// write a java program using generics such that there is a general shape class and a rectangle class that implements area and such

class someShapes {
    static class Shape<T extends Number>
    {
        private final T width;
        private final T height;

        public Shape(T width, T height) {
            this.width = width;
            this.height = height;
        }

        public T getWidth() {
            return width;
        }

        public T getHeight() {
            return height;
        }

        public T area() {
            return (T) (Integer) (width.intValue() * height.intValue());
        }
    }

    static class Rectangle<T extends Shape>
    {
        private final T shape;

        public Rectangle(T shape) {
            this.shape = shape;
        }

        public T getShape() {
            return shape;
        }

        public double area() {
            return shape.getWidth().doubleValue() * shape.getHeight().doubleValue();
        }

        public boolean equalArea(T obj2) {
            return this.area() == obj2.area().doubleValue();
        }
    }

}