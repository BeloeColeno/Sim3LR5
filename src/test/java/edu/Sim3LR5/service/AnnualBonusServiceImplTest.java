package edu.Sim3LR5.sevice;

import edu.Sim3LR5.Enum.Positions;
import edu.Sim3LR5.service.AnnualBonusServiceImpl;
import org.junit.jupiter.api.Test;

import static edu.Sim3LR5.service.AnnualBonusServiceImpl.calculateDaysInYear;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AnnualBonusServiceImplTest {

    @Test
    void calculate() {

        //given
        Positions positions = Positions.HR;
        double bonus = 2.0;
        int workDays = 243;
        double salary = 100000.00;

        //when
        double result = new AnnualBonusServiceImpl().calculate(positions, salary, bonus, workDays);

        //then
        double expected = 360493.8271604938;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testCalculateDaysInYear() {
        int year = 2023;
        Positions positions = Positions.MN;

        int result = 91;
        int expected = calculateDaysInYear(year, positions);

        assertThat(result).isEqualTo(expected);
    }
}