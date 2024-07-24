// This is a generated file. Not intended for manual editing.
package org.hannesnisula.cpp2plugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface Cpp2FuncDef extends PsiElement {

  @NotNull
  List<Cpp2ParamDecl> getParamDeclList();

  @Nullable
  Cpp2Statement getStatement();

  @Nullable
  Cpp2StatementBlock getStatementBlock();

  @Nullable
  Cpp2TypeSpecifier getTypeSpecifier();

}
