package FactoryPattern.challenge;

public class ZoneFactory {
    public Zone createZone(String zoneId) {
        Zone zone = switch (zoneId) {
            case "US/Pacific" -> new ZoneUSPacific();
            case "US/Mountains" -> new ZoneUSMountain();
            case "US/Central" -> new ZoneUSCentral();
            case "US/Eastern" -> new ZoneUSEastern();
            default -> null;
        };

        return zone;
    }

}
