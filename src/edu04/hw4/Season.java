package edu04.hw4;

public enum Season {
    WINTER {
        public String getSeasonName() {
            return "Winter";
        }
    },
    SPRING {
        public String getSeasonName() {
            return "Spring";
        }
    },
    SUMMER {
        public String getSeasonName() {
            return "Summer";
        }
    },
    AUTUMN {
        public String getSeasonName() {
            return "Autumn";
        }
    };

    public abstract String getSeasonName();
}
