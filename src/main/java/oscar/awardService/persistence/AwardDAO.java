package oscar.awardService.persistence;

import oscar.awardService.model.Award;

import java.util.List;
/**
 * implements
 * crud
*/
public class AwardDAO implements IAwardDAO{

    @Override
    public Award findAwardByName(String name) {
        return null;
    }

    @Override
    public void createAward(Award award) {

    }

    @Override
    public void deleteAward(Award award) {

    }

    @Override
    public List<Award> findAllAward(Award award) {
        return null;
    }

    @Override
    public Award UpdateAward(Award award) {
        return null;
    }
}
