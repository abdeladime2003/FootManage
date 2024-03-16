package com.ana.demo1;

public class Transfert1 implements Transfert {

        private String playerName;
        private String fromTeam;
        private String toTeam;

        public Transfert1(String playerName, String fromTeam, String toTeam) {
            this.playerName = playerName;
            this.fromTeam = fromTeam;
            this.toTeam = toTeam;
        }

        public String getPlayerName() {
            return playerName;
        }

        public String getFromTeam() {
            return fromTeam;
        }

        public String getToTeam() {
            return toTeam;
        }
    }
