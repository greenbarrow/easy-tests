package easytests.models;

import easytests.entities.IssueStandardQuestionTypeOptionEntity;
import easytests.models.empty.IssueStandardModelEmpty;
import easytests.models.empty.QuestionTypeModelEmpty;
import lombok.Data;

/**
 * @author SingularityA
 */
@Data
public class IssueStandardQuestionTypeOptionModel implements IssueStandardQuestionTypeOptionModelInterface {

    private Integer id;

    private QuestionTypeModelInterface questionType;

    private Integer minQuestions;

    private Integer maxQuestions;

    private Integer timeLimit;

    private IssueStandardModelInterface issueStandard;

    public void map(IssueStandardQuestionTypeOptionEntity questionTypeOptionEntity) {
        this.setId(questionTypeOptionEntity.getId());
        this.setQuestionType(new QuestionTypeModelEmpty(questionTypeOptionEntity.getQuestionTypeId()));
        this.setMinQuestions(questionTypeOptionEntity.getMinQuestions());
        this.setMaxQuestions(questionTypeOptionEntity.getMaxQuestions());
        this.setTimeLimit(questionTypeOptionEntity.getTimeLimit());
        this.setIssueStandard(new IssueStandardModelEmpty(questionTypeOptionEntity.getIssueStandardId()));
    }
}
