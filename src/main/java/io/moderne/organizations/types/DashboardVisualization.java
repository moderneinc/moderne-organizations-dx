package io.moderne.organizations.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class DashboardVisualization {
  private DashboardRecipe recipe;

  private String visualizationId;

  private List<Option> visualizationOptions;

  public DashboardVisualization() {
  }

  public DashboardVisualization(DashboardRecipe recipe, String visualizationId,
      List<Option> visualizationOptions) {
    this.recipe = recipe;
    this.visualizationId = visualizationId;
    this.visualizationOptions = visualizationOptions;
  }

  public DashboardRecipe getRecipe() {
    return recipe;
  }

  public void setRecipe(DashboardRecipe recipe) {
    this.recipe = recipe;
  }

  public String getVisualizationId() {
    return visualizationId;
  }

  public void setVisualizationId(String visualizationId) {
    this.visualizationId = visualizationId;
  }

  public List<Option> getVisualizationOptions() {
    return visualizationOptions;
  }

  public void setVisualizationOptions(List<Option> visualizationOptions) {
    this.visualizationOptions = visualizationOptions;
  }

  @Override
  public String toString() {
    return "DashboardVisualization{" + "recipe='" + recipe + "'," +"visualizationId='" + visualizationId + "'," +"visualizationOptions='" + visualizationOptions + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DashboardVisualization that = (DashboardVisualization) o;
        return java.util.Objects.equals(recipe, that.recipe) &&
                            java.util.Objects.equals(visualizationId, that.visualizationId) &&
                            java.util.Objects.equals(visualizationOptions, that.visualizationOptions);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(recipe, visualizationId, visualizationOptions);
  }

  public static io.moderne.organizations.types.DashboardVisualization.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private DashboardRecipe recipe;

    private String visualizationId;

    private List<Option> visualizationOptions;

    public DashboardVisualization build() {
                  io.moderne.organizations.types.DashboardVisualization result = new io.moderne.organizations.types.DashboardVisualization();
                      result.recipe = this.recipe;
          result.visualizationId = this.visualizationId;
          result.visualizationOptions = this.visualizationOptions;
                      return result;
    }

    public io.moderne.organizations.types.DashboardVisualization.Builder recipe(
        DashboardRecipe recipe) {
      this.recipe = recipe;
      return this;
    }

    public io.moderne.organizations.types.DashboardVisualization.Builder visualizationId(
        String visualizationId) {
      this.visualizationId = visualizationId;
      return this;
    }

    public io.moderne.organizations.types.DashboardVisualization.Builder visualizationOptions(
        List<Option> visualizationOptions) {
      this.visualizationOptions = visualizationOptions;
      return this;
    }
  }
}
