CREATE TABLE Tournament(TournamentID INT PRIMARY KEY, NAME VARCHAR(255), seasonYear VARCHAR(255), tournamentType VARCHAR(5), numberOfRounds int, korrektionType VARCHAR(5));

CREATE TABLE Round(RoundID INT PRIMARY KEY, number int, seasonYear VARCHAR(255), tournamentType VARCHAR(5), numberOfRounds int, korrektionType VARCHAR(5));


