// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2ForLoop extends PsiElement {

  @NotNull
  List<Cpp2Argument> getArgumentList();

  @Nullable
  Cpp2Identifier getIdentifier();

  @Nullable
  Cpp2StatementBlock getStatementBlock();

}
