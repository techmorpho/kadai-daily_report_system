package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Project;

public class ProjectValidator {
    public static List<String> validate(Project r) {
        List<String> errors = new ArrayList<String>();

        String project_id_error = _validateTitle(r.getProject_id());
        if(!project_id_error.equals("")) {
            errors.add(project_id_error);
        }

        String project_name_error = _validateProject_name(r.getProject_name());
        if(!project_name_error.equals("")) {
            errors.add(project_name_error);
        }

        return errors;
    }

    private static String _validateTitle(String project_id) {
        if(project_id == null || project_id.equals("")) {
            return "タイトルを入力してください。";
            }

        return "";
    }

    private static String _validateProject_name(String project_name) {
        if(project_name == null || project_name.equals("")) {
            return "内容を入力してください。";
            }

        return "";
    }
}
