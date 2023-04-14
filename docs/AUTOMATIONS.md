# Automations

In order to simplify the experience for designers and developers and to guarantee the relevance of the information shared between the different skills, we have implemented various automations.

## Icons Handoff Automation Process

This process automates the handoff of icons from design to code. It involves the following steps:

1. Publish New Icons on Figma: Icons are designed and published on Figma in the "Export for developers" page on the main branch (main) of the Vitamix Design System repository:

![icons-handoff-1](https://user-images.githubusercontent.com/9600228/232066422-f9061259-edcb-4666-ae53-74a40e1847af.gif)

2. Trigger Fetch Icons Workflow: After icons are published on Figma, go to the "Actions" tab on the [Vitamin Design GitHub repository](https://github.com/Decathlon/vitamin-design) and manually trigger the "[Manual] Fetch icons" workflow:

![icons-handoff-2](https://user-images.githubusercontent.com/9600228/232066726-49c72e75-cdd8-4c81-9d80-9877a725b5d1.gif)
![icons-handoff-3](https://user-images.githubusercontent.com/9600228/232066899-445c132b-f518-4806-92e3-f68ab2ac0363.gif)


3. Review and Merge PR: Once the "Fetch icons" workflow completes, it will create a Pull Request (PR) on the [vitamin-design](https://github.com/Decathlon/vitamin-design) repository. Review the PR, ensure that the icons are correctly fetched, and then merge the PR to the main branch:

![icons-handoff-4](https://user-images.githubusercontent.com/9600228/232066952-a6abe0e2-e969-4926-bad2-c5fdefeaf7b0.gif)
![icons-handoff-5](https://user-images.githubusercontent.com/9600228/232067018-7a80e190-b38f-4241-97f0-78270c8aeaa2.gif)

4. Trigger PR Creation Workflow: After the PR is merged on the main branch, another workflow will be triggered via GitHub Actions. This workflow will create PRs on all the developer repositories where the icons need to be added:

![icons-handoff-6](https://user-images.githubusercontent.com/9600228/232067104-ef538275-3d55-4e82-b8ce-b66f18649a13.gif)

5. Review and Merge PRs on Developer Repositories: Review each PR created by the workflow on the respective developer repositories. Ensure that the icons are added at the correct locations and in the expected formats. Once reviewed, merge the PRs to complete the handoff process 🎉:

![icons-handoff-7](https://user-images.githubusercontent.com/9600228/232067316-392eee85-7c68-41d6-a131-d82c71d8c43f.gif)
