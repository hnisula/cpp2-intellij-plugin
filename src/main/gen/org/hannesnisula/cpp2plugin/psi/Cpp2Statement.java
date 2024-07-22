// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2Statement extends PsiElement {

  @Nullable
  Cpp2ReturnExpression getReturnExpression();

  @Nullable
  Cpp2VarAssignment getVarAssignment();

  @Nullable
  Cpp2VarDeclaration getVarDeclaration();

  @Nullable
  Cpp2VarDefinition getVarDefinition();

}
