class Solution:
    def winnerOfGame(self, colors: str) -> bool:
        countA = 0
        countB = 0
        consecutiveA = 0
        consecutiveB = 0

        for currentColor in colors:
            if currentColor == 'A':
                consecutiveA += 1
                consecutiveB = 0  # Reset consecutiveB count
            elif currentColor == 'B':
                consecutiveB += 1
                consecutiveA = 0  # Reset consecutiveA count
            else:
                # If it's not 'A' or 'B', reset both counts
                consecutiveA = 0
                consecutiveB = 0

            if consecutiveA >= 3:
                countA += 1

            if consecutiveB >= 3:
                countB += 1

        return countA > countB
