
    class RectangleAdapter implements Shape {
        private LegacyRectangle legacyRectangle;

        public RectangleAdapter(LegacyRectangle legacyRectangle) {
            this.legacyRectangle = legacyRectangle;
        }

        // Convert (x1, y1), (x2, y2) format to (x, y, width, height)
        public void draw(int x1, int y1, int x2, int y2) {
            int x = Math.min(x1, x2);
            int y = Math.min(y1, y2);
            int width = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);
            legacyRectangle.draw(x, y, width, height);
        }
    }

