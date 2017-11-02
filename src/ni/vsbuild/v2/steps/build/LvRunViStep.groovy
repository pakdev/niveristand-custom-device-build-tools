package ni.vsbuild.v2.steps.build

import ni.vsbuild.v2.BuildConfiguration
import ni.vsbuild.v2.steps.AbstractStep

class LvRunViStep extends AbstractStep {

   def vi
   
   LvRunViStep(script, jsonStep) {
      super(script, jsonStep)
      this.vi = jsonStep.getString('vi')
   }
   
   void execute(BuildConfiguration configuration) {
      script.lvRunVi(vi, '2017')
   }
}
