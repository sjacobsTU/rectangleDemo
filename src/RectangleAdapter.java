
    class RectangleAdapter implements Shape {
        private LegacyRectangle legacyRectangle;

        public RectangleAdapter(LegacyRectangle legacyRectangle) {
            this.legacyRectangle = legacyRectangle;
        }

        // Convert (x1, y1), (x2, y2) format to (x, y, width, height)
        public void draw(int x1, int y1, int x2, int y2) {

        }
    }

